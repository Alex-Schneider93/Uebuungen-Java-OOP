import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Imbis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean weiter = true;

        while (weiter) {

            System.out.println("=== Imbiss Verkauf ===");
            System.out.println("1 = Döner (4.50 EUR)");
            System.out.println("2 = Kohlsuppe (2.75 EUR)");
            System.out.println("3 = Pizza Hawaii (6.65 EUR)");
            System.out.print("Ihre Auswahl: ");

            int auswahl = sc.nextInt();

            String artikel = "";
            double preis = 0.0;

            switch (auswahl) {
                case 1:
                    artikel = "Doener";
                    preis = 4.50;
                    break;
                case 2:
                    artikel = "Kohlsuppe";
                    preis = 2.75;
                    break;
                case 3:
                    artikel = "PizzaHawaii";
                    preis = 6.65;
                    break;
                default:
                    System.out.println("Ungültige Auswahl – bitte erneut versuchen.");
                    continue; // zurück zum Schleifenanfang
            }

            System.out.print("Anzahl: ");
            int anzahl = sc.nextInt();

            if (anzahl <= 0) {
                System.out.println("Anzahl muss positiv sein.");
                continue;
            }

            double gesamt = preis * anzahl;

            Path pfad = Paths.get("C:", "Java", "imbiss.csv");
            // === Schreiben in CSV mit PrintWriter + BufferedOutputStream ===
            try (BufferedOutputStream bos =
                         new BufferedOutputStream(new FileOutputStream(pfad.toString(), true));
                 PrintWriter pw = new PrintWriter(bos)) {

                pw.println(artikel + ";" + preis + ";" + anzahl + ";" + gesamt);

                // PrintWriter puffert → flush ist wichtig, aber close() macht es automatisch
                pw.flush();

                System.out.println("Datensatz gespeichert.");

            } catch (IOException e) {
                System.out.println("Fehler beim Schreiben der Datei: " + e.getMessage());
            }

            System.out.print("Weiteren Verkauf eingeben? (ja/nein): ");
            String antwort = sc.next();

            if (!antwort.equalsIgnoreCase("ja")) {
                weiter = false;
            }
        }

        System.out.println("Programm beendet.");
    }
}
