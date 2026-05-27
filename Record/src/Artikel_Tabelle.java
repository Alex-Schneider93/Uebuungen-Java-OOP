public class Artikel_Tabelle {
    public static void main(String[] args) {
        Artikel[] tabelle = new Artikel[3];
        tabelle[0] = new Artikel("Hose", 23.45, 10);
        tabelle[1] = new Artikel("Hemd", 19.99, 12);
        tabelle[2] = new Artikel("Socken", 5.89, 15);


        int index = 0;
        while (index < tabelle.length) {
            Artikel zeile = tabelle[index];
            if (zeile.preis() >= 19.99) {
                System.out.println("Artikel: " + zeile.bezeichnung());
                System.out.println("Preis: " + zeile.preis());
                System.out.println("Menge:" + zeile.menge());
                System.out.println("Warenwert: " + zeile.getWarenwert());
                System.out.println();
            }
            index++;
        }

    }
}
