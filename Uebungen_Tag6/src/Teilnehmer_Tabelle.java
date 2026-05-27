import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Teilnehmer_Tabelle {
    public static void main(String[] args) {
        teilnehmer[] tabelle = new  teilnehmer[12];

        tabelle[0]= new teilnehmer(1, "Anna", 20, "Python");
        tabelle[1] = new teilnehmer(2, "Max-Mustermann", 22, "Kreativ");
        tabelle[2] = new teilnehmer(3, "Clara", 25, "Disziplin");
        tabelle[3] = new teilnehmer(4, "David", 28, "Empathie");
        tabelle[4] = new teilnehmer(5, "Elena", 20, "Zielstrebig");
        tabelle[5] = new teilnehmer(6, "Felix", 24, "Kreativ");
        tabelle[6] = new teilnehmer(7, "Maximilian-Friedrich", 27, "Disziplin");
        tabelle[7] = new teilnehmer(8, "Hans", 35, "Python");
        tabelle[8] = new teilnehmer(9, "Ida", 29, "Kommunikation");
        tabelle[9] = new teilnehmer(10, "Jonas", 32, "Strategie");
        tabelle[10] = new teilnehmer(11, "Kim", 20, "Python");
        tabelle[11] = new teilnehmer(12, "Leo", 35, "Strategie");



        // Ausgabe aller Teilnehmer
        System.out.println("---Ausgabe aller Teilnehmer---");
        int index = 0;
        while (index < tabelle.length){
            teilnehmer zeile = tabelle[index];
            System.out.println(zeile);
            index++;

        }

        // Durschnittsalter

        System.out.println();
        System.out.println("-----Durschnittsalter------");

        int summe = 0;
        double durschnitt = 0;
        for (int i = 0; i < tabelle.length; i++) {
            teilnehmer alter = tabelle[i];
            summe += tabelle[i].alter();

        }
        durschnitt = summe / tabelle.length;
        System.out.println("Durschnittsalter = " +  durschnitt);
        System.out.println();



        // Ausgabe jüngster Teilnehmer
        System.out.println("---Ausgabe jüngster Teilnehmer---");

        int minAlter = tabelle[0].alter();

        for (int i = 1; i < tabelle.length; i++) {
            if (tabelle[i].alter() < minAlter){
                minAlter = tabelle[i].alter();
            }
        }

        String name = "";
        for (int i = 0; i < tabelle.length; i++) {
            if (tabelle[i].alter() == minAlter){
                name += tabelle[i].name() + ", ";
            }
        }

        System.out.println("Jüngste(r) = " +  name + " mit " + minAlter  );
        System.out.println();


        // Ausgabe ältester Teilnehmer
        System.out.println("---Ausgabe ältester Teilnehmer---");
        int maxAlter = tabelle[0].alter();
        for (int i = 1; i < tabelle.length; i++) {
            if (tabelle[i].alter() > maxAlter) {
                maxAlter = tabelle[i].alter();
            }
        }

        String namen= "";

        for (int i = 0; i < tabelle.length; i++) {
            if (tabelle[i].alter() == maxAlter) {
                namen += tabelle[i].name() + ", ";
            }
        }
        System.out.println("Älteste(r): " + namen + " mit " + maxAlter + " Jahren");
        System.out.println();


        // User Kurs Eingabe
        System.out.println("----Kurs finden (Teilnehmer)----");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Welche Kurs wollen sie? Bitte eingeben: ");
        String eingabe = scanner.nextLine();

        // Eingabe in der Tabelle suchen
        String ausgabeName = "";

        for (int i = 0; i < tabelle.length; i++) {
            if (tabelle[i].kurs().toLowerCase().equals(eingabe.toLowerCase())) {
                ausgabeName += tabelle[i].name() + ", ";
            }
        }
        System.out.println("Teilnehmer von '" + eingabe.toUpperCase() + "' Kurs sind -> " + ausgabeName);

        System.out.println();


        // Ausgabe alle Namen mit mehr als 10 Zeichen
        System.out.println("----Alle Namen mit mehr als 10 Zeichen----");

        int zaehler = 0;
        String namen10 = "";
        for (int i = 0; i < tabelle.length; i++) {
            if (tabelle[i].name().length() >= 10) {
                zaehler++;
                namen10 += tabelle[i].name() + ", ";
            }
        }
        System.out.println("es gibts : " + zaehler + " Namen was mehr wie 10 Zeichen haben");
        System.out.println(namen10);
    }

}
