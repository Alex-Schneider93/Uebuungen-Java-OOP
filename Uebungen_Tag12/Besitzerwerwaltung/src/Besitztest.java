public class Besitztest {
    public static void main(String[] args) {
        double summmeSchmuck = 0;
        double summeImmobilien = 0;
        double summeGesammt = 0;

        Besitz[] tabelle = new Besitz[5];

        tabelle[0] = new Schmuck("Halskette", Material.GOLD, 35.99);
        tabelle[1] = new Immobilie("Jagdschloss", 225, 3765);
        tabelle[2] = new Immobilie("Villa am See", 120, 2225);
        tabelle[3] = new Schmuck("Brosche", Material.SILBER, 56.89);
        tabelle[4] = new Schmuck("Ohrringe", Material.SILBER, 12.56);

        for (int i = 0; i < tabelle.length; i++) {
            System.out.printf(tabelle[i].toString() +
                            "\n"+"Preis: %.2f €\n" ,
                            tabelle[i].berechneWert());
            System.out.println("----------------------------------------------");

            if(tabelle[i] instanceof  Schmuck){
                summmeSchmuck += tabelle[i].berechneWert();
            } else if (tabelle[i] instanceof Immobilie) {
                summeImmobilien += tabelle[i].berechneWert();
            }
            summeGesammt =  summeImmobilien + summmeSchmuck;

        }

        System.out.printf("Summe Schmuck: %.2f €\n" , summmeSchmuck);
        System.out.printf("Summe Immobilien: %.2f €\n" , summeImmobilien);
        System.out.printf("Gesamt : %.2f €" , summeGesammt);


    }
}
