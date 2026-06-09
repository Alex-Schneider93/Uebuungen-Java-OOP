import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LesenDatei {

    public static void main(String[] args) throws FileNotFoundException {

        Path pfad =  Paths.get("C:", "Uebung_Tag15", "Personen.csv");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(pfad.toString()));

            for(String zeile : reader.readAllLines()) {
                System.out.println(zeile);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("---------------------------------------\n");

        try {
             //Reader in = new FileReader(pfad.toString());
             BufferedReader reader = new BufferedReader(new FileReader(pfad.toString()));
            int summe = 0;  // Summe von ale (Alter) einträge
            double durschnitt = 0;
            int zaehler = 0;

            for (String zeile : reader.readAllLines()) {
                String[] werte = zeile.split(";");
                int alter = Integer.parseInt(werte[1]);
                summe += alter;
                zaehler++;
                reader.close();
                durschnitt = summe / zaehler;
            }

            System.out.println("Durchschnittsalter: " + durschnitt);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
