/**
 * Created by bebon on 04/12/2017.
 */
class Batiment {
    List<Etage> etages
    Ascenseur ascenseur

    String etat() {
        "Cabine ${ascenseur.cabine.position}. Etages ${etages.size()}"
    }

    Batiment() {
        this(new LinkedList<Etage>())
    }

    Batiment(LinkedList<Etage> etages1) {
        this(etages1, new Ascenseur())
    }

    Batiment(LinkedList<Etage> etages1, Ascenseur ascenseur1) {
        etages = etages1
        ascenseur = ascenseur1
    }
}
