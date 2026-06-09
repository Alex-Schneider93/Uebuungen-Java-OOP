import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class DatenAuslesen {
    public static void main(String[] args) {

        NumberFormat format = NumberFormat.getInstance(Locale.GERMANY);
        Path datei = Paths.get("C:", "Uebung_Tag15","Personen.csv");


        System.out.println("Name    |  Alter  |  Wohnort\n------------------------------");
        try {
            List<String> zeilen = Files.readAllLines(datei);
            for (String zeile : zeilen) {
                String[] werte = zeile.split(";");

                System.out.println(werte[0] + "       " + werte[1] + "       " + werte[2]);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }
}
