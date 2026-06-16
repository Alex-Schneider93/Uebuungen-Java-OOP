import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SchreibenDatei {
    public static void main(String[] args) {
        // Datei muss nicht vorhanden sein
        Path pfad = Paths.get("C:", "Java", "datei.txt");

        try {
            try (PrintWriter pw = new PrintWriter(pfad.toString())) {
                pw.println("Hallo Welt");
                pw.close();
            }
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }

        // -------------------------------------------------------

        Path pfad2 = Paths.get("C:", "Java", "datei2.txt");
        // variante mit Anhängen von Zeilen

        try {
            OutputStream out = new FileOutputStream(pfad2.toFile(), true);
            PrintWriter pw2 = new PrintWriter(out);
            pw2.println("Hallo Welt");
            pw2.close();
            out.close();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
