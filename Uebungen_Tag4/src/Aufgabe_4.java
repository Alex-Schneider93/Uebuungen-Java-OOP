import java.util.Scanner;

public class Aufgabe_4 {
    public  static void main(String[] args) {
//Ein User hat maximal 3 Versuche, um das richtige Passwort einzugeben. Dieses lautet: "Bockwur$t1".
//Wenn er das richtige Passwort eingibt, dann öffnet sich ein Safe mit einem Berg Gold.
//Wenn er das richtige Passwort nicht eingibt, dann bleibt der Safe verschlossen.
//
//Beispiel:
//- Eingabe: hase --> falsch, 1. Versuch
//- Eingabe: igel -> falsch, 2. Versuch
//- Eingabe: blubb -> falsch, 3. Versuch --> Safe bleibt zu
//
//- Eingabe: hase --> falsch, 1. Versuch
//- Eingabe: Bockwur$t1 --> richtig --> Safe öffnet sich


        Scanner eingabe = new Scanner(System.in);

        int versuche = 3;
        String passwort = "Bockwur$t1";
        String versuch;


        do {
            System.out.print("Passwort eingeben: ");
            versuch = eingabe.nextLine();

            if (versuch.equals(passwort)) {
                System.out.println("Passwort korrekt!");
                System.out.println("Safe öffnet sich.....");
                break;
            }else{
                versuche--;
                System.out.println("Falsch, Sie haben noch " + versuche + " Versuche");
            }
        }while (versuch.equals(passwort) || versuche > 0);
        System.out.println("Keine Versuche mehr! Safe bleibt zu");
    }
}
