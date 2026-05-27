public class Artiker_Objekt {
    public static void main(String[] args) {
        Artikel a1 = new  Artikel("hose",23.45,10 );

        System.out.println(a1);

        System.out.println("Bezeichnung: " + a1.bezeichnung());
        System.out.println("Preis: " + a1.preis());
        System.out.println("Menge: " + a1.menge());
        System.out.println("---------------------------------");
        Artikel a2 = new  Artikel("hemd",15.45,12);
        System.out.println("Bezeichnung: " + a2.bezeichnung());
        System.out.println("Preis: " + a2.preis());
        System.out.println("Menge: " + a2.menge());
        System.out.println("-------------------------------------");
        // double wert1 = a1.menge() * a1.preis();
        // double wert2 = a2.menge() * a2.preis();

        double wert1 = a1.getWarenwert();
        double wert2 = a2.getWarenwert();

        System.out.printf("Warenwert 1:%.2f " , wert1);
        System.out.println();
        System.out.printf("Warenwert 2:%.2f " , wert2);

    }
}
