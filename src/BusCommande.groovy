/**
 * Created by bebon on 04/12/2017.
 */
class BusCommande {
    CarnetCommande carnetCommande

    void ecouter(Commande commande) {
        carnetCommande.ajouter(commande)
    }

    BusCommande() {
        this(new CarnetCommande())
    }

    BusCommande(CarnetCommande carnetCommande1) {
        carnetCommande = carnetCommande1
    }

}
