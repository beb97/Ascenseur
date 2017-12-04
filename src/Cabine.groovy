/**
 * Created by bebon on 04/12/2017.
 */
class Cabine {
    Integer position
    BusCommande bus

    void monter() {
        this.position++
    }

    void descendre() {
        this.position--
    }

    Cabine(BusCommande bus1) {
        this(new Integer(0), bus1)
    }

    Cabine(Integer position1, BusCommande bus1) {
        position = position1
        bus = bus1
    }
}
