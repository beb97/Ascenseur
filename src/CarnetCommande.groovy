/**
 * Created by bebon on 04/12/2017.
 */
class CarnetCommande {
    LinkedList<Ordre> ordres

    void ecouter(Ordre ordre) {
        ordres.add(ordre)
    }

    Ordre restituer() {
        def ordre = ordres.getFirst()
        ordres.removeFirst()
        ordre
    }

    CarnetCommande() {
        this(new LinkedList<Ordre>())
    }

    CarnetCommande(LinkedList<Ordre> ordres1) {
        ordres = ordres1
    }
}
