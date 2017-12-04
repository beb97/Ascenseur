/**
 * Created by bebon on 04/12/2017.
 */
class CarnetCommande {
    LinkedHashSet<Commande> commandes

    void ajouter(Commande ordre) {
        commandes.add(ordre)
    }

    Commande restituer() {
        Commande commande = commandes.getAt(0)
        commandes.remove(commande)
        commande
    }

    CarnetCommande() {
        this(new LinkedList<Commande>())
    }

    CarnetCommande(LinkedList<Commande> ordres1) {
        commandes = ordres1
    }
}
