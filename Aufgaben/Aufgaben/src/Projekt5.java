/*
Ziel
Das Programm soll alle geraden Zahlen von 1 bis 10 addieren.

Gewünschte Ausgabe
Summe: 30
 */
public class Projekt5 {

    public static void main(String[] args) {

        int zahl = 1;
        int summe = 0;

        while (zahl <= 10) {

            if (zahl % 2 != 0) {
                summe = summe + zahl;
            }

            zahl++;
        }

        System.out.println("Summe: " + summe);
    }
}
