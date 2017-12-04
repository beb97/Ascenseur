/**
 * Created by bebon on 04/12/2017.
 */
class Ascenseur {
    Cabine cabine
    CarnetCommande carnetCommande

    void executer(Ordre ordre) {
        while (!ordre.cible.numero.equals(cabine.position)) {
            if (ordre.cible.numero > cabine.position) {
                cabine.monter()
            } else {
                cabine.descendre()
            }
        }
    }

    Ascenseur(Cabine cabine1) {
        this(cabine1, new CarnetCommande())
    }

    Ascenseur() {
        this(new Cabine())
    }

    Ascenseur(Cabine cabine1, CarnetCommande carnetCommande1) {
        cabine = cabine1
        carnetCommande = carnetCommande1
    }

}
