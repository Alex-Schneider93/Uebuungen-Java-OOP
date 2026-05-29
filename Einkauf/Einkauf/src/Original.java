/*
Ausgangssituation

Das Programm verarbeitet mehrere Artikel eines Einkaufs.

Für jeden Artikel werden eingegeben:

die Anzahl
der Einzelpreis

Das Programm berechnet:

den Gesamtpreis pro Artikel
die Gesamtsumme
den Durchschnittspreis pro Artikel
 */

import java.util.Scanner;

public class Original {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wie viele Artikel?");
        int artikelAnzahl = sc.nextInt();

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

            zaehler++;
        }

        durchschnitt = gesamtsumme / artikelAnzahl;

        System.out.println("------------------");
        System.out.println("Gesamtsumme: " + gesamtsumme);
        System.out.println("Durchschnitt: " + durchschnitt);
    }
}
