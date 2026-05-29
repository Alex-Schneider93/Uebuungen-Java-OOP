public class Main {
    public static void main(String[] args) {
        Ticket[] tabelle = new Ticket[6];
        tabelle[0] = new Ticket("Dying Fetus",39.99,Saal.GROSS, 850);
        tabelle[1] = new Ticket("Helene Fischer" , 79.99,Saal.KLEIN, 299);
        tabelle[2] = new Ticket("Heino", 59.89, Saal.GROSS, 765);
        tabelle[3] = new Ticket("Lena", 45.99, Saal.KLEIN, 245);
        tabelle[4] = new Ticket("Michelle", 29.99, Saal.KLEIN, 199);
        tabelle[5] = new Ticket();

        
        for (int i = 0; i < tabelle.length; i++) {
            int ticketsUebrich = tabelle[i].saal.kapazitaet - tabelle[i].verkauft;
            System.out.println(
                    "Nummer: " + tabelle[i].nummer + ",\n" +
                    "Band: " +tabelle[i].band + ",\n" +
                    "Preis: "+tabelle[i].preis+"\n" +
                    "Saal: " + tabelle[i].saal + "\n"+
                    "Kapazität: " +tabelle[i].saal.kapazitaet + ", \n"+
                    "Verkauft: " + tabelle[i].verkauft  + ",\n" +
                    "Noch " + ticketsUebrich + " Tickets übrich."
            );
            System.out.println("------------------------------------------");
        }

    }
}
