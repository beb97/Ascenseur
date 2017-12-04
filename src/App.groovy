/**
 * Created by bebon on 04/12/2017.
 */
class App {
    static void main(String[] args) {
        LinkedList<Etage> etages = new LinkedList<Etage>()
        5.times { etages.add(new Etage(it)) }
        def batiment = new Batiment(etages)
        def sortie = new SortieBatiment(batiment)
        def ordre = batiment.etages.get(2).appel()

        sortie.contenu()
//        batiment.ascenseur.carnetCommande.ecouter(ordre)
//        batiment.ascenseur.carnetCommande.restituer()
        batiment.ascenseur.executer(ordre)
        sortie.contenu()
    }
}
