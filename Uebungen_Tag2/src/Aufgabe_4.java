import java.util.Scanner;

public class Aufgabe_4 {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        int anzahlKarten;
        double einzelnPreis = 6.50;
        String weiter;
        int karten = 30;



        do {
            System.out.print("Anzahl Karten: ");
            anzahlKarten = eingabe.nextInt();

            double summe = anzahlKarten * einzelnPreis;
            int rest = karten - anzahlKarten;
            if (anzahlKarten < rest) {
                System.out.println("Nicht genug Karten mehr");
            }else {
                System.out.println("Summe: " + summe);
                System.out.println("Karten verfügbar: " + rest);
                System.out.print("Weiter 'n' zum beenden? ");

            }
            weiter = eingabe.nextLine();
        }while(weiter.equals("j"));
        System.out.println("Bye Bye");

    }
}
