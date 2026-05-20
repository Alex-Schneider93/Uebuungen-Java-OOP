import java.util.Scanner;

public class Aufgabe_2 {
    public static void main(String[] args) {
        int zahl1, zahl2, widerholungen = 0, produkt = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Geben Sie Zahl 1 an:");
        zahl1 = input.nextInt();
        System.out.print("Geben Sie Zahl 2 an:");
        zahl2 = input.nextInt();

        while (widerholungen < zahl1) {
            produkt += zahl2;
            widerholungen++;
        }

        System.out.println("Ergebnis:" + produkt);
    }
}