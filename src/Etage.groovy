/**
 * Created by bebon on 04/12/2017.
 */
class Etage {
    Integer numero

    Ordre appel() {
        return new Ordre(this, this)
    }

    Etage(Integer numero1) {
        numero = numero1
    }
}
