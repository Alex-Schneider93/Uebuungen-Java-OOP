/*
Ziel
Alle "o" sollen durch "0" ersetzt werden.

Gewünschte Ausgabe
Hall0 W0rld
 */
public class Projekt6 {
    public static void main(String[] args) {

        String text = "Hallo World";
        String neu = "";

        int i = 0;

        while (i < text.length()) {

            if (text.charAt(i) == 'a') {
                neu = neu + "0";
            } else {
                neu = neu + text.charAt(i);
            }

            i++;
        }

        System.out.println(neu);
    }
}
