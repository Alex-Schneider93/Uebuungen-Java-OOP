public class Kampfarena {
    private Spieler spieler1;
    private Spieler spieler2;

    public Kampfarena() {
        this.spieler1 = null;
        this.spieler2 = null;
    }

    public void setSpieler1(Spieler spieler1) {
        this.spieler1 = spieler1;
    }

    public void setSpieler2(Spieler spieler2) {
        this.spieler2 = spieler2;
    }

    public void starteKampf() {
        if (spieler1 == null || spieler2 == null) {
            System.out.println("Es wurden noch nicht zwei Spieler festgelegt.");
            return;
        }

        System.out.println("\n--- DER KAMPF BEGINNT... ---");
        int runde = 1;

        while (!spieler1.istTot() && !spieler2.istTot()) {
            System.out.println("\n[Runde " + runde + "]");

            double schaden1 = spieler1.kaempfen();
            spieler2.setEnergie(schaden1);

            if (!spieler2.istTot()) {
                double schaden2 = spieler2.kaempfen();
                spieler1.setEnergie(schaden2);
            }

            System.out.println(spieler1);
            System.out.println(spieler2);

            runde++;
        }

        System.out.println("\n--- KAMPF BEENDET... ---");
        if (spieler1.istTot()) {
            System.out.println(spieler2.getName() + " hat gewonnen!");
        } else {
            System.out.println(spieler1.getName() + " hat gewonnen!");
        }
    }
}