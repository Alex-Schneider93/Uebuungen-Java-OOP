import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class BestellungenAuslesen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.print("Bitte Bestellnummer eingeben 'x' zum beenden: ");
            String bestellNr = scanner.nextLine();

            Path pfad = Paths.get("C:", "Java", "bestellung_" + bestellNr + ".csv");

            double gesamtSumme = 0;

            try (BufferedReader reader = new BufferedReader(new FileReader(pfad.toString()))) {

                String zeile;

                while ((zeile = reader.readLine()) != null) {

                    String[] split = zeile.split(";");

                    if (split.length == 5 && !split[0].equals("Summe")) {
                        String name = split[0];
                        String artikel = split[1];
                        double preis = Double.parseDouble(split[2]);
                        double anzahl = Double.parseDouble(split[3]);
                        double summeArtikel = Double.parseDouble(split[4]);

                        gesamtSumme += summeArtikel;

                        System.out.println(
                                "Name: " + name +
                                        ", Artikel: " + artikel +
                                        ", Anzahl: " + preis +
                                        ", Einzelpreis: " + anzahl +
                                        ", Summe Einzelartikel: " + summeArtikel
                        );
                    }
                }

                System.out.printf("Summe total: %.2f", gesamtSumme);

            } catch (Exception e) {
                System.out.println("Datei nicht gefunden oder Fehler beim Lesen!");
            }

            scanner.close();
        }

}
