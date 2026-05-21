import java.util.Scanner;

public class Aufgabe_1 {
    public static void main(String[] args) {
        // Aufgabe 1
        //Ein Nutzer soll eine ganze Zahl eingeben. Wenn diese durch 3 teilbar ist, erhält er eine
        //Topfpflanze; ansonsten einen Eimer Kohle.
        Scanner input = new Scanner(System.in);
        int zahl;

        System.out.print("Zahl eingeben: ");
        zahl = input.nextInt();
        if (zahl % 3 == 0) {
            System.out.println("Du bekommsat ein Topfpflanze");
        } else {
            System.out.println("Du bekommsat ein Eimer Kohle ");
        }


    }
}
