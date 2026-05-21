/*
Ziel
Das Programm soll alle "a" zählen.

Gewünschte Ausgabe
anzahl=4
 */

public class Projekt3
{
    public static void main(String[] args) {

        String text = "ananas";
        int index = 0;
        int anzahl = 0;

        while (index < text.length()) {

            if (text.charAt(index) == 'e') {
                anzahl++;
            }

            index++;
        }

        System.out.println("Anzahl: " + anzahl);
    }
}
