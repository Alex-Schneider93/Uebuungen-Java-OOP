import java.util.Scanner;

public class Aufgabe_3 {
    public static void main(String[] args) {

        String text;
        int anzahlVokale = 0, zaehler = 0;



        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie einen Text eingeben:");
        text = scanner.nextLine();


        text = text.toLowerCase();
        while (zaehler < text.length()) {
            if (text.charAt(zaehler) == 'a'|| text.charAt(zaehler)=='e'
                    || text.charAt(zaehler)=='i' || text.charAt(zaehler)=='o'
                    || text.charAt(zaehler)=='u' || text.charAt(zaehler)=='ä'
                    || text.charAt(zaehler)=='ö' || text.charAt(zaehler)=='ü' ) {
                anzahlVokale++;

            }
            zaehler++;
        }
        System.out.println("Vokale Anzahl: " + anzahlVokale);
        System.out.println("Anzahl Zeichen: " + zaehler);







    }
}
