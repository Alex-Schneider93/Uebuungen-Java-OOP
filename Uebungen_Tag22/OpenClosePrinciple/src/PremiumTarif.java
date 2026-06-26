public class PremiumTarif implements KostenBerechenbar {

    double verbrauch;
    String tarif;


    public PremiumTarif(double verbrauch) {
        this.verbrauch = verbrauch;
    }

    @Override
    public double berechneKosten() {
      verbrauch = verbrauch * 0.25 + 10;
        return verbrauch;
    }


}
