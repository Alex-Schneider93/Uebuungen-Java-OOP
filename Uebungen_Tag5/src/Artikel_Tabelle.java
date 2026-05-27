public class Artikel_Tabelle {
    public static void main(String[] args) {
        Artikel[] tabelle = new Artikel[7];
        tabelle[0] = new Artikel("Hose", 23.45, 10, "kleidung");
        tabelle[1] = new Artikel("hemd", 19.99, 12, "kleidung");
        tabelle[2] = new Artikel("Socken", 5.89, 15, "kleidung");
        tabelle[3] = new Artikel("Brot", 3.5, 25, "lebensmittel");
        tabelle[4] = new Artikel("Butter", 2.54, 30, "lebensmittel");
        tabelle[5] = new Artikel("Honig", 4.99, 18, "lebensmittel");
        tabelle[6] = new Artikel("Buch", 23.80,4,"null");

        System.out.println("----------Kategorie Lebensmittel-------------");
        System.out.println();
        int index = 0;
        int anzahlLebensmittel = 0;
        double warenWertLebensmittel = 0;
        while (index < tabelle.length) {
            Artikel zeile = tabelle[index];

            if (zeile.kategorie().equals("lebensmittel")){
                System.out.println("Artikel:" + zeile.bezeichnung());
                System.out.println("Preis: " + zeile.preis());
                System.out.println("Menge: " + zeile.menge());
                System.out.println("Kategorie:" + zeile.kategorie());
                System.out.printf("Warenwert: %.2f\n" , zeile.getWarenwert());
                System.out.println();
                anzahlLebensmittel += zeile.menge();
            }
            warenWertLebensmittel += zeile.getWarenwert();
            index++;
        }
        System.out.println("Anzahl Artikel Der kat. Lebensmittel : " + anzahlLebensmittel);
        System.out.printf("Gesamten Warenwert Lebensmittel: %.2f\n" , warenWertLebensmittel);

        System.out.println();
        System.out.println();
        System.out.println("----------Kategorie Kleidung-------------");
        index = 0;
        int anzahlKleidung = 0;
        double durschnittKleidung = 0;
        double summeWert= 0;
        while (index < tabelle.length) {
            Artikel zeile = tabelle[index];
            if (zeile.kategorie().equals("kleidung")){
                System.out.println("Artikel:" + zeile.bezeichnung());
                System.out.println("Preis: " + zeile.preis());
                System.out.println("Menge: " + zeile.menge());
                System.out.println("Kategorie:" + zeile.kategorie());
                System.out.printf("Warenwert: %.2f\n" , zeile.getWarenwert());
                System.out.println();
                anzahlKleidung += zeile.menge();
                summeWert += zeile.getWarenwert();
            }

            index++;

        }
        durschnittKleidung = summeWert/anzahlKleidung;
        System.out.println("Anzahl Artikel Der kat. Kleidung : " + anzahlKleidung);
        System.out.printf("Durschnittspreis Kelidung: %.2f\n" , durschnittKleidung);

        double maxPreis = 0;
        String artikel = "";

        for (int i = 0; i < tabelle.length; i++) {
            Artikel zeile = tabelle[i];
            if (tabelle[i].preis() > maxPreis){
                maxPreis = tabelle[i].preis();
                artikel = zeile.bezeichnung();

            }

        }

        System.out.printf("Grösste Artikeleinzelpreis-> %s: %.2f € ",artikel, maxPreis );
    }
}