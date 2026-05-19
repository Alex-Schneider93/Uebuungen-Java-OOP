import java.util.Scanner;

public class Aufgabe_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long eingabe;
        double stunden, minuten, sekunden;

        System.out.println("Sekunden eingeben");
        eingabe = input.nextLong();

        stunden = eingabe / 3600;
        minuten = (eingabe % 3600) / 60;
        sekunden = eingabe % 60;

        System.out.printf("Stunden %.2f, Minuten %.2f, Sekunden %.2f", stunden, minuten, sekunden);
        input.close();
    }
}
