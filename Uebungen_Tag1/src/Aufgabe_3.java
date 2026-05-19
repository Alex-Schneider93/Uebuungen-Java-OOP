import java.util.Scanner;

public class Aufgabe_3 {

    static void main(String[] args) {
        double radius;
        double flaeche;
        String wahl;

        Scanner sc = new Scanner(System.in);

        IO.println("Eingabe Radius");
        radius= sc.nextDouble();
        sc.nextLine();

        IO.println("Wählen 'u' für Umfang, 'f' für Fläche berechnen:");
        wahl = sc.nextLine().toLowerCase();




        if (wahl.equals("u")){
            double umfangBerechnen = 2 * Math.PI * radius;
            System.out.printf("Umfang =  %.2f" , umfangBerechnen);
        }
        else if (wahl.equals("f")) {
            double flaecheBerechnen = Math.PI * radius * radius;
            System.out.printf("Fläche = %.2f" + flaecheBerechnen);
        }else
        {
            IO.println("Falsche Eingabe");
        }


    }
}
