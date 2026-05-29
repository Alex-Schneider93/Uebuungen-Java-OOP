/*
Wenn die Gesamtsumme über 100 € liegt:

10 % Rabatt berechnen

Ausgabe zusätzlich:
- Rabatt in EUR
- Endpreis

 */
import java.util.Scanner;

public class Aufgabe2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wie viele Artikel?");
        int artikelAnzahl = sc.nextInt();

        int zaehler = 0;
        double rabat = 0, endpreis = 0;

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

        if (gesamtsumme > 100){
            rabat = gesamtsumme * 0.10;
        }
        endpreis  = gesamtsumme - rabat;
        durchschnitt = gesamtsumme / artikelAnzahl;


        System.out.println("Gesamtsumme: " + gesamtsumme);
        System.out.println("Durchschnitt: " + durchschnitt);
        System.out.println("Rabat in EUR: " + rabat);
        System.out.println("Endpreis: " + endpreis);
    }
}
