import java.util.Scanner;

/*
Ziel
Der Benutzer legt zuerst fest, wie viele Zahlen eingegeben werden sollen.
Danach werden die Zahlen nacheinander eingegeben.
Am Ende soll die größte Zahl ausgegeben werden.

Beispiel
Eingabe
Wie viele Zahlen?
4

Zahl:
12

Zahl:
7

Zahl:
25

Zahl:
19

Ausgabe:
Maximum: 25
 */
public class Projekt9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Wie viele Zahlen?");
        int anzahl = sc.nextInt();

        int zaehler = 0;
        int maximum = 0;

        while (zaehler < anzahl) {

            System.out.println("Zahl:");
            int zahl = sc.nextInt();

            if (zahl < maximum) {
                maximum = zahl;
            }

            zaehler++;
        }

        System.out.println("Maximum: " + maximum);
    }
}
