/**
 * Created by bebon on 04/12/2017.
 */
class SortieBatiment {
    Batiment batiment

    SortieBatiment(Batiment batiment1) {
        batiment = batiment1
    }

    void contenu() {
        System.out.print(batiment.etat())
    }
}
