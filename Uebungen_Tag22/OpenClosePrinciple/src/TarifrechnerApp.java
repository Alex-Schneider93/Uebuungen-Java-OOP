public class TarifrechnerApp {
    public static void main(String[] args) {

        KostenBerechenbar[] kunden = new KostenBerechenbar[2];
        kunden[0] = new StandardTarif( 350);
        kunden[1] = new PremiumTarif(350);


        for (KostenBerechenbar k : kunden) {
            System.out.println(k.getClass().getName() +": " + k.berechneKosten());
        }
    }

}
