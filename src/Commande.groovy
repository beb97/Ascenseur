import groovy.transform.EqualsAndHashCode

/**
 * Created by bebon on 04/12/2017.
 */
@EqualsAndHashCode(excludes = ["date", "source"])
class Commande {
    Etage source
    Etage cible
    Date date

    Commande(Etage source1, Etage cible1) {
        source = source1
        cible = cible1
        date = new Date()
    }

    Commande(Etage source1) {
        this(source1, source1)
    }
}
