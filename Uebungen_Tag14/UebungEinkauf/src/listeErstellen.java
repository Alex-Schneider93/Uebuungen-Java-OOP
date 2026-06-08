import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class listeErstellen {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        // Ordnername
        Path ordner = Paths.get("C:","Java");
        try {
            Files.createDirectories(ordner);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        // Dateiname
        System.out.print("Wie soll die Datei heißen: ");
        String dateiname = sc.nextLine();
        Path datei = ordner.resolve(dateiname + ".csv");

        if (Files.notExists(datei)) {
            try {
                Files.createFile(datei);
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }

        }


        System.out.println("Gib Artikel ein (oder 'exit' zum Beenden).");

        while (true) {
            System.out.print("Artikel: ");
            String artikel = sc.nextLine();

            if (artikel.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Anzahl: ");
            String anzahl = sc.nextLine();

            System.out.print("Einzelpreis: ");
            String preis = sc.nextLine();

            String zeile = artikel + ";" + anzahl + ";" + preis + "\n";
            try {
                Files.writeString(datei, zeile, StandardOpenOption.APPEND);
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Einkaufszettel gespeichert in: " + datei.toAbsolutePath());
    }
}
