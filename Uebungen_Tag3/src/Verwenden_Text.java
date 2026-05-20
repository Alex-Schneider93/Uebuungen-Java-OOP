import java.util.Scanner;

public class Verwenden_Text {
    public static void main(String[] args) {
        String text;
        int anzahl;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie einen Text eingeben:");
        text = scanner.nextLine();

        anzahl = text.length();
        System.out.println("Anzahl der Zeichen: " + anzahl);

        text = text.toLowerCase();
        System.out.println("Text in klein: " + text);


        System.out.println("Erste Zeichen: " + text.charAt(0));
        System.out.println("Letzte Zeichen: " + text.charAt(text.length()-1));



        int zaehler = 0;
        while (zaehler < text.length()) {
            System.out.println((text.charAt(zaehler)) );
            zaehler++;
        }
        System.out.println(zaehler);
    }
}
