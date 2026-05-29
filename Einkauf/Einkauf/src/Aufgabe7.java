/*
Verbessere die Ausgabe.

Beispiel:
------ Kassenbon ------

Artikel 1: 3.0 Euro
Artikel 2: 10.0 Euro
Artikel 3: 10.0 Euro

-----------------------
Gesamtsumme: 23.0 Euro
Durchschnitt: 7.67 Euro
-----------------------
 */

import java.util.Scanner;

public class Aufgabe7
{
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
