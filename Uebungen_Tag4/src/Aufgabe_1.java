/*
Erweitere das Programm.

Alle Artikel mit einem Gesamtpreis über 20 € sollen gezählt werden.
Die Anzahl wird zum Schluss ebenfalls ausgegeben.
 */
import java.util.Scanner;

public class Aufgabe_1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wie viele Artikel?");
        int artikelAnzahl = sc.nextInt();
        int zaehler_20 = 0;
        int zaehler = 0;


        double gesamtsumme = 0;
        double durchschnitt = 0;

        while (zaehler < artikelAnzahl) {

            System.out.println("Anzahl:");
            int anzahl = sc.nextInt();

            System.out.println("Einzelpreis:");
            double preis = sc.nextDouble();

            double artikelSumme = anzahl * preis;

            System.out.println("Artikelpreis: " + artikelSumme);

            gesamtsumme = gesamtsumme + artikelSumme;

            if (artikelSumme > 20) {
                zaehler_20++;
            }
            zaehler++;
        }

        durchschnitt = gesamtsumme / artikelAnzahl;

        System.out.println("Anzahl " +
                "Artikeln über 20: " + zaehler_20);
        System.out.println("Gesamtsumme: " + gesamtsumme);
        System.out.println("Durchschnitt: " + durchschnitt);

    }
}
