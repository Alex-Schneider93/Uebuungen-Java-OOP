import java.util.Scanner;

public class Aufgabe_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int note1 = 0, note2 = 0, note3 = 0, note4 = 0, note5 = 0, note6 = 0;
        int summeNoten = 0;
        int eingabe = 0;
        int schuelerZaehler = 1;

        do {
            System.out.print("Note für Schüler " + schuelerZaehler + " (1-6) eingeben: ");
            eingabe = scanner.nextInt();

            if (eingabe > 6 || eingabe < 1) {
                System.out.println("Falsche Eingabe! Bitte erneut versuchen.");
            } else {
                if (eingabe == 6) {
                    note6 += 1;
                } else if (eingabe == 5) {
                    note5 += 1;
                } else if (eingabe == 4) {
                    note4 += 1;
                } else if (eingabe == 3) {
                    note3 += 1;
                } else if (eingabe == 2) {
                    note2 += 1;
                } else {
                    note1 += 1;
                }

                summeNoten += eingabe;
                schuelerZaehler += 1;
            }

        } while (schuelerZaehler < 11);

        System.out.println("Note 1: " + note1 + " X");
        System.out.println("Note 2: " + note2 + " X");
        System.out.println("Note 3: " + note3 + " X");
        System.out.println("Note 4: " + note4 + " X");
        System.out.println("Note 5: " + note5 + " X");
        System.out.println("Note 6: " + note6 + " X");

        double durchschnitt = (double) summeNoten / 10;
        System.out.println("Noten Durchschnitt: " + durchschnitt);

        scanner.close();
    }
}