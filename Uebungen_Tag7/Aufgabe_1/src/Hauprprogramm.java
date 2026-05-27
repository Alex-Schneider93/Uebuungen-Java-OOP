import java.util.Scanner;

public class Hauprprogramm {
    public static void main(String[] args) {

        Meldung [] tabelle = new Meldung[6];
        tabelle[0] = new Meldung(Typ.INFO, "Benutzer angemeldet");
        tabelle[1] = new Meldung(Typ.ERROR, "Datenbankverbindung fehlgeschlagen");
        tabelle[2] = new Meldung(Typ.WARNING, "Speicher fast voll");
        tabelle[3] = new Meldung(Typ.INFO, "Datei gespeichert");
        tabelle[4] = new Meldung(Typ.ERROR, "Zugrif verweigert");
        tabelle[5] = new  Meldung(Typ.INFO, "Benutzer abgemeldet");

        Typ[] werte = Typ.values();


        for (int i = 0; i < werte.length; i++) {
            System.out.println(i + " - " + werte[i]);
        }
        System.out.println();

        Typ suche = Typ.INFO;
        for (int i = 0; i < 3; i++) {
            if (tabelle[i].was() == suche) {
                System.out.println(i + " - " + tabelle[i]);
            }
        }




        // User wählt aus dem Menü einen Typ aus
        // Das Programm gibt alle Meldungen des Typs aus



        Scanner input = new Scanner(System.in);
        System.out.print("Zahl eingeben: ");
        int wahl = input.nextInt();

        if (wahl >= 0 && wahl < werte.length) {
            Typ gesuchterTyp = werte[wahl];

            for (int i = 0; i < tabelle.length; i++) {
                if (tabelle[i].was() == gesuchterTyp) {
                    System.out.println(i + " - " + tabelle[i]);
                }
            }
        }else{
            System.out.println("Fehler!");
        }


        System.out.println();

        // User gibt einen Suchbegriff wie Datenbank oder Zugriff ein und das Programm gibt
        // alle Meldungen mit diesem Suchbegriff aus.
        System.out.println("--User gibt einen Suchbegriff wie Datenbank oder Zugriff ein--");


        System.out.print("Begriff: ");
        String begriff = input.nextLine();

        input.close();

        for (int i = 0; i < tabelle.length; i++) {
            if(tabelle[i].text().contains(begriff)){
                System.out.println(i + " - " + tabelle[i]);
            }

        }



    }
}
