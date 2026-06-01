public class Main {
    public static void main(String[] args)
    {
        //wir testen unsere Klasse
        //erstellen drei Mitarbeiterobjekte


        //Standard-Konstruktor, die Werte haben Standardwerte
        Mitarbeiter obj1 = new Mitarbeiter();

        Mitarbeiter obj2 = new Mitarbeiter("1", "Meier", "poststelle");

        Mitarbeiter obj3 = new Mitarbeiter("2", "schmidt", "buchhaltung", 2500, 2);

        //Eigenschaften anzeigen
        System.out.println(obj1.zeigeInfo());
        System.out.println();
        System.out.println(obj2.zeigeInfo());
        System.out.println();
        System.out.println(obj3.zeigeInfo());
        System.out.println();

        //teste die Validierunglogik, ob setGehalt() keine falschen Werte setzt
        obj1.setGehalt(5000);
        System.out.println(obj1.getGehalt());  //sollte funktionieren

        obj1.setGehalt(-2000);
        System.out.println(obj1.getGehalt());  //darf nicht funktionieren

        //--------------------------------
        System.out.println("-------------------------------");

        Mitarbeiter obj4 = new Mitarbeiter("EMP001", "Max Mustermann", "Entwickler", 50000, 5);
        Mitarbeiter obj5 = new Mitarbeiter("EMP002", "Maria Müller", "Manager", 75000, 8);
        Mitarbeiter obj6 = new Mitarbeiter("EMP003", "John Doe", "Designer", 45000, 3);

        System.out.println(obj4.zeigeInfo());
        System.out.println();
        System.out.println(obj5.zeigeInfo());
        System.out.println();
        System.out.println(obj6.zeigeInfo());
        System.out.println();

        obj4.setMitarbeiterID("");
        obj4.setGehalt(-200);
        obj4.setErfahrungsjahre(-3);

        System.out.println("-------------------------------");

        Mitarbeiter anna = new Mitarbeiter("EMP001","Anna Schmidt", "Entwicklerin", 60000, 5);

        anna.zeigeInfo();

        anna.zeigeInfoOhneGehalt();

        System.out.println("Standardbonus: " + anna.berechneBonus());
        System.out.println("Bonus mit Faktor 0.15: " + anna.berechneBonus(0.15));
        System.out.println("Bonus mit alles: " + anna.berechneBonus(0.15, 1000));
    }
}