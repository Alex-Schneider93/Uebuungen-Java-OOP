package ablauf;

import aufbau.Tabelle;
import aufbau.Wohnung;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Tabelle wohnung = new Tabelle();
        wohnung.laden();

        while(true){

            System.out.print("Name (oder 'x' zum Beenden): ");
            String name = input.nextLine();

            if(name.equalsIgnoreCase("x")){
                break;
            }

            System.out.print("Fläche: ");
            double flaeche = input.nextDouble();

            System.out.print("Kaltmiete: ");
            double kaltmiete = input.nextDouble();

            System.out.print("Nebenkosten: ");
            double nebenkosten = input.nextDouble();

            input.nextLine();

            wohnung.insert(name, flaeche, kaltmiete, nebenkosten);
        }

        ArrayList<Wohnung> alle = wohnung.select();
        boolean alle2 = wohnung.speichern();


        for (Wohnung w : alle) {
            System.out.println(w);

            System.out.println("-----------------------");

        }

    }
}
