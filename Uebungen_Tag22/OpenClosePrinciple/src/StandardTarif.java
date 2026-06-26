public class StandardTarif implements KostenBerechenbar {


    double verbrauch;



    public StandardTarif( double verbrauch) {
        this.verbrauch = verbrauch;
    }

    @Override
    public double berechneKosten() {
        verbrauch =  verbrauch * 0.30;
        return verbrauch;
    }


}
