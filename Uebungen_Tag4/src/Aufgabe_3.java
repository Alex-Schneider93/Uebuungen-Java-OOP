/*
erweitere das Programm:

Das Programm soll ebenfalls den höchsten Artikelpreis ausgeben (Einzelpreis)
 */

import java.util.Scanner;

public class Aufgabe_3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wie viele Artikel?");
        int artikelAnzahl = sc.nextInt();

        int zaehler = 0;

        double gesamtsumme = 0;
        double durchschnitt = 0;
        double hoechsterPreis = 0;

        while (zaehler < artikelAnzahl) {
            System.out.println("Anzahl:");
            int anzahl = sc.nextInt();
            System.out.println("Einzelpreis:");
            double preis = sc.nextDouble();
            if (preis > hoechsterPreis) {
                hoechsterPreis = preis;
            }
            double artikelSumme = anzahl * preis;
            System.out.println("Artikelpreis: " + artikelSumme);
            gesamtsumme = gesamtsumme + artikelSumme;
            zaehler++;
        }

        durchschnitt = gesamtsumme / artikelAnzahl;

        System.out.println("Höchster Einzelpreis: "+ hoechsterPreis);
        System.out.println("Gesamtsumme: " + gesamtsumme);
        System.out.println("Durchschnitt: " + durchschnitt);
    }

}
