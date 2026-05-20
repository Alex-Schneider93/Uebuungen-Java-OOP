import java.util.Scanner;

public class Aufgabe_1 {
    public static void main(String[] args) {

        int eingabe, rest, stunden = 0, minuten = 0, sekunden = 0;
        int durchlauf = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sekunden eingeben: ");
        eingabe = scanner.nextInt();
        rest = eingabe;

        while (durchlauf < 3) {
            durchlauf++;
            if (durchlauf == 1) {
                stunden = rest / 3600;
                rest = rest % 3600;
            } else if (durchlauf == 2) {
                minuten = rest / 60;
                rest = rest % 60;
            } else if (durchlauf == 3) {
                sekunden = rest;
            }
        }

        System.out.println("Stunden: " + stunden);
        System.out.println("Minuten: " + minuten);
        System.out.println("Sekunden: " + sekunden);

        scanner.close();
    }
}