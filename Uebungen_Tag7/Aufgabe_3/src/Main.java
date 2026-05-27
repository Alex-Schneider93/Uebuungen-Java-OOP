import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

    Details[] tabelle = new  Details[6];

    tabelle[0] = new Details(1001, "Müller", 2.5,Paket_Art.STANDARD);
    tabelle[1] = new Details(1002, "Schmidt", 1.2, Paket_Art.EXPRES);
    tabelle[2] = new Details(1003, "Meier", 5.7, Paket_Art.PREMIUM);
    tabelle[3] = new Details(1004, "Fischer", 3.1, Paket_Art.STANDARD);
    tabelle[4] = new Details(1005, "Wagner", 0.8, Paket_Art.EXPRES);
    tabelle[5] = new Details(1006, "Schulz", 5.7, Paket_Art.STANDARD);

        double summeVersandkosten = 0;
        double durschnittVersandkosten = 0;
        int standard = 0;
        int express = 0;
        int premium = 0;
        double schwerstePaket = 0.0;
        String nameSchwerstePaket = "";

        for (int i = 0; i < tabelle.length; i++) {
            Details details = tabelle[i];

            System.out.println("Nr: " + details.nr()
                    +", Empfänger: " + details.Empfaenger()
                    +", Gewicht: " + details.gewicht()
                    +", Paketart: " + details.paketArt()
                    +", Versandkosten: " + details.paketArt().versandkosten);
            summeVersandkosten += details.paketArt().versandkosten;
            durschnittVersandkosten = summeVersandkosten / tabelle.length;

            switch (details.paketArt()) {
                case STANDARD -> standard++;
                case EXPRES   -> express++;
                case PREMIUM  -> premium++;
            }
            if (details.gewicht() > schwerstePaket){
                schwerstePaket = details.gewicht();
                nameSchwerstePaket = details.Empfaenger();
            }else if (details.gewicht() == schwerstePaket){
                nameSchwerstePaket += "', '" + details.Empfaenger();
            }
        }
        System.out.printf("Summe der Versandkosten: %.2f €\n" , (summeVersandkosten));
        System.out.printf("Durchschnittliche Versandkosten pro Paket: %.2f €\n" , durschnittVersandkosten);
        System.out.println("Standard Pakete: " + standard + " Stück");
        System.out.println("Express Pakete:  " + express +  " Stück");
        System.out.println("Premium Pakete:  " + premium +  " Stück");
        System.out.println("'" + nameSchwerstePaket + "':" + " hat/haben das schwerste Paket mit: " + schwerstePaket + " kg.");
    }
}
