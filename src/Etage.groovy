/**
 * Created by bebon on 04/12/2017.
 */
class Etage {
    Integer numero
    BusCommande bus

    void appel() {
        bus.ecouter(new Commande(this, this))
    }

    Etage(Integer numero1, BusCommande bus1) {
        numero = numero1
        bus = bus1
    }
}
