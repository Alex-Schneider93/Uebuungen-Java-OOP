import java.util.Scanner;

public class Aufgabe_1 {
    public static void main(String[] args) {
        double laenge, breite;
        Scanner eingabe = new Scanner(System.in);
        IO.println("Länge eingen: ");
        laenge = eingabe.nextDouble();

        IO.println("Breite eingeben: ");
        breite = eingabe.nextDouble();


        double flaeche = laenge * breite;
        double umfang = 2 * (laenge * breite);

        IO.println("Fläche: " + flaeche);
        IO.println("Umfang: " + umfang);

        eingabe.close();
    }
}
