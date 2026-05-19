import java.util.Scanner;

public class Aufgabe_8 {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        double gefahrenenKm;
        double kmPreis;

        System.out.println("Gefahrenen KM eingeben:");
        gefahrenenKm = eingabe.nextDouble();

        if (gefahrenenKm <= 200){
            kmPreis = 0;
        } else if (gefahrenenKm > 200 && gefahrenenKm <= 1000) {
            kmPreis = (gefahrenenKm - 200) * 0.60;
        } else {
            kmPreis = (800 * 0.60) + (gefahrenenKm - 1000) * 0.40;
        }
        System.out.printf("Gesamtkosten %.2f €: " , kmPreis);
        eingabe.close();
    }
}