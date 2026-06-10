import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class BestellungenSortieren {
    public static void main(String[] args) {

        Path pfad = Paths.get("C:", "Java", "bestellungen.csv");
        ArrayList<String> gemerkteBestellungen = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(pfad.toString()));

            for (String zeile : reader.readAllLines()) {

                String[] zeileSplit = zeile.split(";");

                if (zeile.startsWith("b") || zeile.isEmpty() || zeileSplit.length != 5) {
                    continue;
                }

                String bestellNr = zeileSplit[0];
                Path pfad2 = Paths.get("C:", "Java", "bestellung_" + bestellNr + ".csv");

                boolean anhaengen = true;
                if (!gemerkteBestellungen.contains(bestellNr)) {
                    anhaengen = false;
                    gemerkteBestellungen.add(bestellNr);
                }

                try (FileWriter fw = new FileWriter(pfad2.toFile(), anhaengen);
                     PrintWriter pw = new PrintWriter(fw)) {

                    double preis = Double.parseDouble(zeileSplit[3]);
                    double menge = Double.parseDouble(zeileSplit[4]);
                    double summeArtikel = preis * menge;

                    pw.println(zeileSplit[1] + ";" + zeileSplit[2] + ";" + preis + ";" + menge + ";" + summeArtikel
                    );

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }


            for (String bestellNr : gemerkteBestellungen) {

                Path pfad2 = Paths.get("C:", "Java", "bestellung_" + bestellNr + ".csv");

                double summeGesamt = 0;

                try (BufferedReader reader2 = new BufferedReader(new FileReader(pfad2.toString()))) {

                    for (String zeile : reader2.readAllLines()) {

                        String[] split = zeile.split(";");

                        if (split.length == 5) {
                            summeGesamt += Double.parseDouble(split[4]);
                        }
                    }

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                try (FileWriter fw = new FileWriter(pfad2.toFile(), true);
                     PrintWriter pw = new PrintWriter(fw)) {

                    pw.println("Summe;" + summeGesamt);

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
