import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Nutzereingaben {
    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);

        Path ordner = Paths.get("C:", "Uebung_Tag15");
        try {
            Files.createDirectories(ordner);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        while (true) {
            System.out.print("Name (oder 'x' zum Beenden): ");
            String name = eingabe.nextLine();

            if (name.equalsIgnoreCase("x")) {
                System.out.println("Programm beendet.");
                break;
            }

            System.out.print("Alter: ");
            int alter = eingabe.nextInt();
            eingabe.nextLine();

            System.out.print("Wohnort: ");
            String wohnort = eingabe.nextLine();

            if (!name.isEmpty() && alter > 0 && !wohnort.isEmpty()) {
                Path datei = ordner.resolve("Personen.csv");
                String zeile = name + ";" + alter + ";" + wohnort + "\n";

                try {
                    Files.writeString(datei, zeile, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                    System.out.println("Daten gespeichert!\n");
                } catch (Exception e) {
                    System.out.println("Fehler beim Schreiben: " + e.getMessage());
                }
            } else {
                System.out.println("Fehler: Felder dürfen nicht leer sein. Bitte von vorn beginnen.\n");
            }
        }

        eingabe.close();
    }
}