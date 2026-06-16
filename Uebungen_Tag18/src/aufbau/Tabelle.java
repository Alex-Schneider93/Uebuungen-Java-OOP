package aufbau;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Tabelle {

    private Path pfad = Paths.get("C:", "Java", "Inventur", "inventur.csv");
    private ArrayList<Inventur> liste = new ArrayList<>();

    // Berechnet die Summe aller absoluten Verluste über alle Inventur-Objekte hinweg
    public double getGesamtAbsolut() {
        double summe = 0;
        for (Inventur i : liste) {
            summe += i.getVerlust().absolut();
        }
        return summe;
    }

    // Lädt die Daten aus der CSV-Datei
    public boolean laden() {
        liste.clear();

        if (!Files.exists(pfad)) {
            return false;
        }

        try (BufferedReader br = Files.newBufferedReader(pfad)) {
            String zeile = br.readLine(); // Überspringt die Kopfzeile
            while ((zeile = br.readLine()) != null) {
                String[] eintraege = zeile.split(";");
                if (eintraege.length >= 5) {
                    // Wandelt Text-Daten aus der Datei in Java-Objekte um
                    String produkt = eintraege[1];
                    double einzelpreis = Double.parseDouble(eintraege[2]);
                    int soll = Integer.parseInt(eintraege[3]);
                    int ist = Integer.parseInt(eintraege[4]);

                    // Fügt das neu erstellte Objekt der temporären Liste hinzu
                    liste.add(new Inventur(produkt, einzelpreis, soll, ist));
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Schreibt den aktuellen Inhalt der Liste zurück in die CSV-Datei
    public boolean speichern() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(pfad.toFile(), false))) {
            pw.println("Nr; Artikel; Einzelpreis; Soll; Ist;"); // Schreibt Kopfzeile
            for (Inventur i : liste) {
                // Formatiert das Inventur-Objekt für die CSV-Speicherung
                String zeile = i.getNummer() + ";" +
                        i.getArtikel() + ";" +
                        i.getEinzelpreis() + ";" +
                        i.getSoll() + ";" +
                        i.getIst();
                pw.println(zeile);
            }
            // Schreibt die Endsumme als Abschluss in die Datei
            pw.println("Verlust absolut: " + getGesamtAbsolut());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public ArrayList<Inventur> getListe() {
        return liste;
    }
    public void insert(Inventur inventur) {
        liste.add(inventur);
    }

    // Gibt alle Artikel und den Gesamtverlust zur Kontrolle auf der Konsole aus
    public void ausgeben() {
        for (Inventur i : liste) {
            System.out.println(i.toString());
        }
        System.out.println("Verlust absolut: " + getGesamtAbsolut());
    }
}