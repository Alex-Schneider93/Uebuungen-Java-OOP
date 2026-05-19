import java.util.Scanner;

public class Aufgabe_3 {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        int paketeAnzahl;
        double summe;
        do {
            System.out.print("Pakete anzahl: ");
            paketeAnzahl = eingabe.nextInt();

        }while (paketeAnzahl < 100);

        summe = paketeAnzahl * 6.99;
        System.out.println("Summe: " + summe);



    }
}
