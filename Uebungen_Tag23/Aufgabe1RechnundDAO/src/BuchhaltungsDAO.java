import java.io.*;
import java.nio.file.*;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class BuchhaltungsDAO {

    private List<Rechnung> liste = new ArrayList<>();
    private Path pfad;

    public BuchhaltungsDAO(String dateiname) {
        this.pfad = Paths.get("C:\\\\Users\\\\Student\\\\" +
                "OneDrive - GFN GmbH (EDU)\\\\Dokumente" +
                "\\\\Desktop\\\\Ausbildung\\\\Programierung\\\\" +
                "LF-ZQ16 A Objektorientierte Programierung mit Java\\\\" +
                "Uebungen_Tag23\\\\Aufgabe1RechnundDAO\\\\" + dateiname);
        laden();
    }

    private void laden() {
        if (Files.exists(pfad)) {
            try {
                List<String> lines = Files.readAllLines(pfad);
                for (String line : lines) {
                    String[] p = line.split(";");
                    Rechnung r = new Rechnung(LocalDate.parse(p[1]), Double.parseDouble(p[2]), Double.parseDouble(p[3]));
                    r.setId(Integer.parseInt(p[0]));
                    liste.add(r);
                }
            } catch (IOException e) {
                System.out.println("Fehler beim Laden: " + e.getMessage());
            }
        }
    }

    private void inDateiSpeichern() {
        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(pfad))) {
            for (Rechnung r : liste) {
                pw.println(r.getId() + ";" + r.getDatum() + ";" + r.getNetto() + ";" + r.getSteuersatz());
            }
        } catch (IOException e) {
            System.out.println("Fehler beim Speichern: " + e.getMessage());
        }
    }

    public List<Rechnung> findAll() {
        return  liste;
    }

    public void save(Rechnung r) {
        int neueId = liste.stream().mapToInt(Rechnung::getId).max().orElse(0) + 1;
        r.setId(neueId);
        liste.add(r);
        inDateiSpeichern();
    }

    public boolean delete(int id) {
        if (liste.removeIf(r -> r.getId() == id)) {
            inDateiSpeichern();
          return true;
        } else {
            return false;
        }
    }

    public List<Rechnung> findByYear(int jahr) {
        return liste.stream().filter(r -> r.getDatum().getYear() == jahr).collect(Collectors.toList());

    }

    public double sumBrutto() {
        return liste.stream().mapToDouble(Rechnung::getBrutto).sum();
    }
}