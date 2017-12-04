/**
 * Created by bebon on 04/12/2017.
 */
class Cabine {
    Integer position

    void monter() {
        this.position++
    }

    void descendre() {
        this.position--
    }

    Cabine(Integer position1) {
        position = position1
    }

    Cabine() {
        this(new Integer(0))
    }
}
