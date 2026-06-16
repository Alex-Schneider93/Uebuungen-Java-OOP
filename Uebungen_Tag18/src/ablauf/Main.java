package ablauf;

import aufbau.Inventur;
import aufbau.Tabelle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tabelle tabelle = new Tabelle();
        Scanner input = new Scanner(System.in);

        tabelle.laden();
        tabelle.ausgeben();

        while (true) {
            System.out.print("Artikelname oder 'x' zum Beenden: ");
            String artikel = input.next();

            if (artikel.equals("x")) {
                tabelle.speichern();
                tabelle.ausgeben();
                System.out.println("Bye Bye");
                break;
            }

            System.out.print("Einzelpreis: ");
            double einzelpreis = input.nextDouble();

            System.out.print("Soll-Bestand: ");
            int soll = input.nextInt();

            System.out.print("Ist-Bestand: ");
            int ist = input.nextInt();

            if (ist <= soll) {
                tabelle.insert(new Inventur(artikel, einzelpreis, soll, ist));
            }else{
                System.out.println("Zählen Sie noch mal die Produkte!");

            }
        }

        System.out.println("Gesamtverlust absolut: " + tabelle.getGesamtAbsolut());

        input.close();
    }
}