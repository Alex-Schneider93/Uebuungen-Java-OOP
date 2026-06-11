package aufbau;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Tabelle {
    private ArrayList<Wohnung> liste = new ArrayList<>();

    public boolean insert(String mieterName, double flaeche, double kaltmiete, double nebenkosten){

        if (flaeche > 0 && kaltmiete > 0 && nebenkosten > 0){
            Wohnung obj = new Wohnung(mieterName, flaeche, kaltmiete, nebenkosten);
            liste.add(obj);
            return true;
        } else {
            System.out.println("Fehler bei der Eingabe!\nSie haben Kaltmitte, Fläche oder Nebenkosten 0 oder kleiner eingegeben");
            return false;
        }
    }

    public ArrayList<Wohnung> select() {
        return liste;
    }

    Path pfad = Paths.get("C:", "Java","Wohnung","wohnungen.csv");

    public boolean speichern() {
        try {
            PrintWriter pw = new PrintWriter(pfad.toString());
            pw.println("Wohnung Nr.;" + "Name Mieter;" + "Flaeche;"+"Kaltmiete;"+"Nebenkosten;" + "Summe");
            for(Wohnung w : liste) {
                String zeile = w.getW() + ";"
                        + w.getMieterName() + ";"
                        + w.getFlaeche() + ";"
                        + w.getKaltmiete() + ";"
                        + w.getNebenkosten() + ";"
                        + w.summe();
                pw.println(zeile);
            }
            pw.close();
        } catch(Exception e) {
            return false;
        }
        return true;
    }

    public boolean laden(){
        if (!Files.exists(pfad)){
            return true;
        }
        try (BufferedReader br = Files.newBufferedReader(pfad)) {
            br.readLine();
            String zeile;
            while ((zeile = br.readLine()) != null) {
                String[] werte = zeile.split(";");

                if (werte.length >= 5) {
                    String nummer = werte[0];
                    String mieter = werte[1];
                    double flaeche = Double.parseDouble(werte[2]);
                    double kaltmiete = Double.parseDouble(werte[3]);
                    double nebenkosten = Double.parseDouble(werte[4]);

                    Wohnung obj = new Wohnung(nummer, mieter, flaeche, kaltmiete, nebenkosten);
                    liste.add(obj);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    }
