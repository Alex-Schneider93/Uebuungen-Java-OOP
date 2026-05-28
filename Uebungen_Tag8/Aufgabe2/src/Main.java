public class Main {
    public static void main(String[] args) {
        Hotel[] tabelle = new Hotel[12];

        tabelle[0] = new Hotel(1001, "Seeblick Resort", "Deutschland", Sterne.VIER);
        tabelle[1] = new Hotel(1002, "Mountain Palace", "Österreich", Sterne.FUENF);
        tabelle[2] = new Hotel(1003, "City Inn", "Deutschland", Sterne.DREI);
        tabelle[3] = new Hotel(1004, "Sunshine Hotel", "Spanien", Sterne.VIER);
        tabelle[4] = new Hotel(1005, "Alpenhof", "Österreich", Sterne.ZWEI);
        tabelle[5] = new Hotel(1006, "Ocean Dream", "Portugal", Sterne.FUENF);
        tabelle[6] = new Hotel(1007, "Budget Stay", "Deutschland", Sterne.EINS);
        tabelle[7] = new Hotel(1008, "Royal Garden", "Frankreich", Sterne.FUENF);
        tabelle[8] = new Hotel(1009, "Central Plaza", "Italien", Sterne.DREI);
        tabelle[9] = new Hotel(1010, "Wellness Spa Hotel", "Schweiz", Sterne.VIER);
        tabelle[10] = new Hotel(1011, "Airport Hotel", "Deutschland", Sterne.ZWEI);
        tabelle[11] = new Hotel(1012, "Mediterraneo", "Griechenland", Sterne.DREI);


        System.out.println("-----Hotels Mit Hohe Ausstattung----");
        int zahl = 0;
        for (int i = 0; i < tabelle.length; i++) {
            if (tabelle[i].sterne() == Sterne.VIER) {
                zahl++;
                System.out.println(zahl + " " +tabelle[i].name() + ", "
                        + tabelle[i].sterne().getBeschreibung() + ", "
                        + Sterne.VIER + " Sterne");
            }
        }


        System.out.println("-------Alle Hotels aus Deutschland-------");
        String hotels = "";
        for (int i = 0; i < tabelle.length; i++) {

                if (tabelle[i].land().equals("Deutschland")) {
                    hotels += "\n"+ tabelle[i].name() + ": " +
                            tabelle[i].land() + ".";
                }
        }
        System.out.println(hotels);

        System.out.println();
        System.out.println("------Anzahl der fünf-Sterne Hotels-----------");

        String hotelsFuenfSterne = "";
        int anzahlHotelsFuenfSterne = 0;
        for (int i = 0; i < tabelle.length; i++) {
            if (tabelle[i].sterne() == Sterne.FUENF) {
                anzahlHotelsFuenfSterne++;
                hotelsFuenfSterne += "\n" + tabelle[i].name() +
                        " mit " + tabelle[i].sterne() + " Sterne :" +
                        tabelle[i].sterne().getBeschreibung();
            }
        }
        System.out.println(hotelsFuenfSterne +
                "\n" +"Es gibt " + anzahlHotelsFuenfSterne +
                " Fünf-Sterne-Hotels.");

        System.out.println("-------Nur Luxus-Hotels--------");
        String nurLuxusHotels = "";
        for (int i = 0; i < tabelle.length; i++) {
            if (tabelle[i].sterne().getBeschreibung().contains("Luxus")){
                nurLuxusHotels +="\n"+ tabelle[i].name() + ": " + tabelle[i].sterne().getBeschreibung();
            }
        }
        System.out.println(nurLuxusHotels);

    }

}