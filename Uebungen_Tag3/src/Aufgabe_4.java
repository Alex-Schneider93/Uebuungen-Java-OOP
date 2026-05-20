import java.util.Scanner;

public class Aufgabe_4 {
    public static void main(String[] args) {
        Scanner cmd = new Scanner(System.in);
        String text;
        int anzahl;
        int anzahlWort = 0;
        int index = 0;
        char zeichen;

        System.out.print("Text: ");
        text = cmd.nextLine().trim();

        anzahl = text.length();

        if (anzahl > 0) {
            anzahlWort = 1;
            while (index < anzahl) {
                zeichen = text.charAt(index);
                if (zeichen == ' ') {
                    anzahlWort++;
                }
                index++;
            }
        }
        System.out.println("Anzahl: " + anzahlWort);
        cmd.close();
    }
}