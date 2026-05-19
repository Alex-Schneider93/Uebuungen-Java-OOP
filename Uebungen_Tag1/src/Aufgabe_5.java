import java.util.Scanner;

public class Aufgabe_5 {
    static void main(String[] args) {
        Scanner userEingabe = new Scanner(System.in);
        double gefahreneZeit;
        double stundeKosten;

        IO.println("Gib die gefahrene Stunden ein.");
        gefahreneZeit = userEingabe.nextDouble();

        if (gefahreneZeit < 4){
            stundeKosten = 7 * gefahreneZeit;
            System.out.printf("Kosten -> %.2f €",stundeKosten);;
        } else if (gefahreneZeit >= 4 && gefahreneZeit < 6 ) {
            stundeKosten = ((7 * 3) - 3) + gefahreneZeit * 5;
            System.out.printf("Kosten -> %.2f €" , stundeKosten);;
        }else {
            stundeKosten = 40 *  gefahreneZeit;
            System.out.printf("Kosten -> %.2f €", stundeKosten);
        }
        userEingabe.close();

    }
}
