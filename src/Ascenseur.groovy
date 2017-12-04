/**
 * Created by bebon on 04/12/2017.
 */
class Ascenseur {
    Cabine cabine
    BusCommande bus

    void executer() {
        Commande commande = bus.carnetCommande.restituer()
        while (!commande.cible.numero.equals(cabine.position)) {
            if (commande.cible.numero > cabine.position) {
                cabine.monter()
            } else {
                cabine.descendre()
            }
        }
    }

    Ascenseur(BusCommande bus1) {
        this(new Cabine(bus1), bus1)
    }

    Ascenseur(Cabine cabine1, BusCommande bus1) {
        cabine = cabine1
        bus = bus1
    }

}
