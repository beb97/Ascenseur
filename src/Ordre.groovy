/**
 * Created by bebon on 04/12/2017.
 */
class Ordre {
    Etage source
    Etage cible
    Date date

    Ordre(Etage source1, Etage cible1) {
        source = source1
        cible = cible1
        date = new Date()
    }

    Ordre(Etage source1) {
        this(source1, source1)
    }
}
