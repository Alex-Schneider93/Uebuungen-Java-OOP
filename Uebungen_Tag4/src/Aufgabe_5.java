import java.sql.SQLOutput;
import java.util.Scanner;

public class Aufgabe_5 {
    public  static void main(String[] args) {
        //Ein Eisverkäufer hat 20 Kugeln Vanille-Eis und 15 Kugeln Schoko-Eis, die er verkaufen kann.
        //
        //Ein User gibt wiederholt ein, wie viele Kugeln von welcher Sorte er kaufen möchte. Das kann er
        // so lange machen,bis es keine Kugeln Eis (beide Sorten ausverkauft) mehr gibt.
        // Er kann aber auch vorher abbrechen.

        //Jede Kugel Eis kostet 1.50 EUR.

        //Das Programm gibt aus:
        //- wie viele Kugeln wurden von welcher Sorte verkauft
        //- wie viel umsatz wurde gemacht (pro Sorte und gesamt)

        //Beispiel:
        //- User kauft 5 Kugeln Vanille --> 5 * 1.50 = 7.50 EUR, es gibt noch 15 Kugeln Vanille, 15 Kugeln Schoko
        //- User kauft 15 Kugeln Vanille --> 15 * 1.5 = 22.50 EUR, es gibt kein Vanille mehr, aber noch Schoko
        //- User kann kein Vanille mehr kaufen, aber Schoko.

        Scanner eingabe = new Scanner(System.in);
        int bestandVanille = 20;
        int bestandSchoko = 15;
        int verkauftVanille = 0;
        int verkauftSchoko = 0;
        double preis = 1.50;
        String sorte;

        do {
            System.out.println("Sorte wählen ('v' für Vanille, 's' für Schoko, 'x' zum Beenden):");
            sorte = eingabe.nextLine();

            if (sorte.equals("v")) {
                System.out.println("Wie viele Kugeln Vanille? (Vorrat: " + bestandVanille + ")");
                int menge = eingabe.nextInt();
                eingabe.nextLine();
                if (menge <= bestandVanille) {
                    bestandVanille -= menge;
                    verkauftVanille += menge;
                } else {
                    System.out.println("Nicht genug Vorrat!");
                }
            } else if (sorte.equals("s")) {
                System.out.println("Wie viele Kugeln Schoko? (Vorrat: " + bestandSchoko + ")");
                int menge = eingabe.nextInt();
                eingabe.nextLine();
                if (menge <= bestandSchoko) {
                    bestandSchoko -= menge;
                    verkauftSchoko += menge;
                } else {
                    System.out.println("Nicht genug Vorrat!");
                }
            }
        } while ((bestandVanille > 0 || bestandSchoko > 0) && !sorte.equals("x"));

        System.out.println("Verkauf abgeschlossen.");
        System.out.println("Vanille verkauft: " + verkauftVanille + " | Umsatz: " + (verkauftVanille * preis) + " EUR");
        System.out.println("Schoko verkauft: " + verkauftSchoko + " | Umsatz: " + (verkauftSchoko * preis) + " EUR");
        System.out.println("Gesamtumsatz: " + ((verkauftVanille + verkauftSchoko) * preis) + " EUR");
    }
}
