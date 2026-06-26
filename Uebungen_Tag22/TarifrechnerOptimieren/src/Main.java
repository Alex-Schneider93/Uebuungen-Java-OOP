public class Main {
    public static void main(String[] args) {

        TarifService service = new TarifService();


        KostenBerechenbar standardtarif = (verbrauch) -> verbrauch * 0.30;
        KostenBerechenbar premiumtarif = (verbrauch) -> verbrauch * 0.25 + 10;
        KostenBerechenbar spartarif = (verbrauch) -> verbrauch * 0.20 + 20;
        KostenBerechenbar luxustarif = (verbrauch) -> verbrauch * 10.0 + 10;



        System.out.println("Standardtarif Kosten: " + service.berechne(standardtarif, 350));
        System.out.println("Premiumtarif Kosten: " + service.berechne(premiumtarif, 350));
        System.out.println("Spartarif kosten: " + service.berechne(spartarif, 550));
        System.out.println("Luxustarif Kosten: " + service.berechne(luxustarif, 550));
    }



}

