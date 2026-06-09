import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class KundenlisteLesen {
    public static void main(String[] args) {

        Path pfad =  Paths.get("C:", "Uebung_Tag15", "kunden.csv");

        int eintraege = 0;
        double durchschnittsalter = 0;
        int summeAlter = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(pfad.toString()));
            for(String zeile : reader.readAllLines()) {
                String[] zeileSplit = zeile.split(";");
                if (zeile.startsWith("#") || zeile.isEmpty() || zeileSplit.length != 4) {
                    continue;
                }
                eintraege++;
                summeAlter += Integer.parseInt(zeileSplit[3]);
                durchschnittsalter = summeAlter / eintraege;
                System.out.println(zeile);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--------------");
        System.out.println("Anzahl gültige Datensätze: " + eintraege);
        System.out.println("Summe Alter: " + summeAlter);
        System.out.println("Durchschnittsalter; " + durchschnittsalter);
    }

}
