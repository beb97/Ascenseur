/**
 * Created by bebon on 04/12/2017.
 */
class App {
    static void main(String[] args) {
        def busCommande = new BusCommande()
        def ascenseur = new Ascenseur(busCommande)

        LinkedList<Etage> etages = new LinkedList<Etage>()
        5.times { etages.add(new Etage(it, busCommande)) }

        def batiment = new Batiment(etages, ascenseur)
        def sortie = new SortieBatiment(batiment)

        sortie.contenu()

        batiment.etages[2].appel()
        batiment.ascenseur.executer()
        sortie.contenu()

        batiment.etages[4].appel()
        batiment.ascenseur.executer()
        sortie.contenu()

    }
}
