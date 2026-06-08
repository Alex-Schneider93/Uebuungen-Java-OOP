import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Spieler[] spielerliste = new Spieler[4];
        spielerliste[0] = new Hexer("Merlin");
        spielerliste[1] = new Hexer("Morgana");
        spielerliste[2] = new Krieger("Arthur");
        spielerliste[3] = new Krieger("Lancelot");

        System.out.println("Verfügbare Spieler:");
        for (int i = 0; i < spielerliste.length; i++) {
            System.out.println(i + ": " + spielerliste[i]);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nWähle Spieler 1 (Nr.): ");
        int auswahl1 = scanner.nextInt();

        System.out.print("Wähle Spieler 2 (Nr.): ");
        int auswahl2 = scanner.nextInt();

        Spieler spieler1 = spielerliste[auswahl1];
        Spieler spieler2 = spielerliste[auswahl2];

        Kampfarena arena = new Kampfarena();
        arena.setSpieler1(spieler1);
        arena.setSpieler2(spieler2);

        arena.starteKampf();

        scanner.close();
    }
}