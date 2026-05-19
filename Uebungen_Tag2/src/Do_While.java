import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        double umsatz, anzahl = 0, summe = 0, durschnitt;
        String wahl;

        do {
            System.out.print("Eingabe Umsatz: ");
            umsatz = eingabe.nextDouble();

            anzahl += 1;
            summe += umsatz;
            System.out.println("Aktuelle Summe: "  + summe);

            System.out.print("Noch mal ? 'j' : ");
            wahl = eingabe.next();

        }while (!wahl.equals("n"));
        System.out.println("Summe : " + summe);
        durschnitt = summe / anzahl;
        System.out.printf("Durchnitt %.2f: " , durschnitt);
        eingabe.close();
    }
}
