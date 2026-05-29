public class Main {
    public static void main(String[] args) {
        // Wir haben kein Objekt der Klasse Taxi
        // wie können uns die Klasseneigenschaften ausgeben lassen
        System.out.println("Marke: " + Taxi.Marke);
        System.out.println("Farbe: " + Taxi.Farbe);

        System.out.println();
        // Marke kann nicht geändert werden, wiel als final definiert ist
        // Muster_Taxi.Marke= "Opel";

        // Farbe kann geändert werden, dan gilt diese für alle Objekte der Klasse Taxi
        Taxi.Farbe= "Rot";

        // Wir erstellen ein Objekt dieser Klasse
        // Wir rufen einen Konstruktor der Klasse auf
        Taxi obj1 = new Taxi();

        // Achtung: Marke ist Klasseneigenschaft, bitte nicht über Objekt aufrufen daher auch dieses Objekt Rot
        System.out.println("Farbe: " + obj1.Farbe);
        System.out.println("Nummer: " + obj1.nummer);
        System.out.println("Fahrer: " + obj1.fahrer);
        System.out.println("KmStand: " + obj1.kmStand);
        System.out.println();
        
        // noch ein Objekt
        Taxi obj2 = new Taxi();
        System.out.println("Nummer: " + obj2.nummer);
        System.out.println("Fahrer: " + obj2.fahrer);
        System.out.println("KmStand: " + obj2.kmStand);
        System.out.println();

        // noch ein Objekt
        Taxi obj3 = new Taxi("Sabine", 12345);
        System.out.println("Numer: " + obj3.nummer);
        System.out.println("Fahrer: " + obj3.fahrer);
        System.out.println("KmStand: " + obj3.kmStand);
        System.out.println();

        // noch ein Objekt
        Taxi obj4 = new Taxi("Maike", 123456,Art.GROSSRAUM);
        System.out.println("Numer: " + obj4.nummer);
        System.out.println("Fahrer: " + obj4.fahrer);
        System.out.println("KmStand: " + obj4.kmStand);
        System.out.println("Autoart: " + obj4.art);

    }
}
