import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //    Fahrzeug f1 = new Fahrzeug("gelb");
        Fahrrad r1 = new Fahrrad(("gelb"));
        Auto a1 = new Auto(("gelb"));

        Fahrzeug fahrrad = new Fahrrad("rot");
        Fahrzeug auto = new Auto("rot");
        Fahrzeug zug = new Zug("blau", "4");

        Person p1 = new Person("Alex", Ziele.MUENCHEN);

        Fahrzeug[] tabelle = new Fahrzeug[]{fahrrad, auto,zug};;


        Scanner input = new Scanner(System.in);

        System.out.println("Ziel eingeben: 1:Berlin, 2: München, 3:Paris");
        System.out.print("Zahl eingeben: ");
        String stadt = input.nextLine();
        switch  (stadt) {
            case "1": p1.setZiele(Ziele.BERLIN); break;
            case "2": p1.setZiele(Ziele.MUENCHEN); break;
            case "3": p1.setZiele(Ziele.PARIS); break;
        }
        System.out.println();
        System.out.println("Sie haben " + p1.getZiele() + " Entschieden. Entfernung: " + p1.getZiele().km + " km");
        System.out.println("---------------------------------------------------");

        System.out.println("Fahrzeuge: 1:Fahrrad, 2:Auto, 3:Zug, 4:laufen");
        System.out.print("Zahl eingeben: ");
        String fahrzeug = input.nextLine();

        switch (fahrzeug) {
            case "1": p1.setFahrzeug(fahrrad); break;
            case "2": p1.setFahrzeug(auto); break;
            case "3": p1.setFahrzeug(zug); break;
            case "4": p1.getFahrzeug(); break;
        }

        System.out.println(p1.bewegen());

    }
}
