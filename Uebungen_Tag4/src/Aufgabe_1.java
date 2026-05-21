public class Aufgabe_1 {
}
/*
Ziel

Das Programm soll später nur Zahlen ausgeben, die:
größer als 10 sind
UND gerade sind

Gewünschte Ausgabe
12
14
16
18
20
 */

public class Projekt1 {
    public static void main(String[] args) {

        int zahl = 1;

        while (zahl <= 20) {

            if (zahl < 10 || zahl % 2 != 0) {
                System.out.println(zahl);
            }

            zahl++;
        }
    }
}
