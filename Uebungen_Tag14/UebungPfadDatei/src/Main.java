import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //es wird einen Pfad zu einem Ordner
        // ACHTUNG: Der Ordner muss nicht existieren
        // dieser Pfad ist zunächst nur eine Zeichenkette

       Path pfad =  Paths.get("C:", "Java", "Tag14");

        System.out.println(pfad);

        System.out.println("Root: " + pfad.getRoot());
        System.out.println("File: " + pfad.getFileName());
        System.out.println("Pos 1: " + pfad.getName(1));

        // Ziel: Erstellen Ordner und Datei!
        try {
            Files.createDirectories((pfad));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
}
        // den Pfad wird ergänzt
        pfad = pfad.resolve("info,txt");

        try {
            Files.createFile(pfad);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // ich schreibe etwas in die Datei
        try {
            // es gibt zwei Varianten
            // Standard: Der Inhalt der Datei wird überschrieben
            // Alternative: Ich möchte den Text an das Ende der datei geschrieben haben
            Files.writeString(pfad, "Hallo Welt", StandardOpenOption.APPEND);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            //Lesen der Datei
            String Text = Files.readString(pfad);
            System.out.println(">" + Text + "<");

            List<String> zeilen = Files.readAllLines(pfad);
            System.out.println("Die Erste zeile: " + zeilen.get(0));
            //Ziel: Erstellen ordner und Datei
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }





//        File datei = pfad.toFile();
//
//        try {
//           boolean geht =  datei.createNewFile();
//            System.out.println("Datei erstellet: " + geht);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }


    }
}

