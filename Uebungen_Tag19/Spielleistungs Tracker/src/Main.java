import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int spiel = 1;
        double maxPunktzahl = 0;
        double erreichtePunktzahl = 0;
        double prozentualeLeistung = 0;
        String ausgabeVorschlag = "";
        String weitereSpiele = "";

        double summeProzent = 0;
        int prozentualeLeistungZaehler = 0;
        double maxLeistung = 0;
        double minLeistung = 100;

        while (spiel != 4) {
            System.out.print("Geben Sie die maximale Punktzahl für Spiel " + spiel + " ein: '0' zum beenden: ");
            maxPunktzahl = input.nextDouble();

            if (maxPunktzahl == 0) {
                break;
            }

            System.out.print("Geben Sie die erreichte Punktzahl für Spiel " + spiel + " ein: ");
            erreichtePunktzahl = input.nextDouble();

            prozentualeLeistung = (erreichtePunktzahl / maxPunktzahl) * 100;
            summeProzent += prozentualeLeistung;
            prozentualeLeistungZaehler++;

            if (prozentualeLeistung > maxLeistung) maxLeistung = prozentualeLeistung;
            if (prozentualeLeistung < minLeistung) minLeistung = prozentualeLeistung;

            if (prozentualeLeistung <= 50) {
                ausgabeVorschlag = "Verbesserungspotenzial";
            } else if (prozentualeLeistung <= 75) {
                ausgabeVorschlag = "Gut";
            } else if (prozentualeLeistung <= 90) {
                ausgabeVorschlag = "Sehr Gut";
            } else {
                ausgabeVorschlag = "Exzellent";
            }

            System.out.println("Spiel: " + spiel + ": Prozentuale Leistung = " + prozentualeLeistung + "% -" + ausgabeVorschlag);

            if (spiel >= 3) {
                System.out.print("Weitere Spiele 'j' oder 'n' : ");
                weitereSpiele = input.next();
                if (!weitereSpiele.equals("j")) {
                    double durchschnittLeistung = summeProzent / prozentualeLeistungZaehler;

                    System.out.println("Durchschnittliche Leistung über alle Spiele: " + durchschnittLeistung + "%");
                    System.out.println("Höchste Leistung: " + maxLeistung + "%");
                    System.out.println("Niedrigste Leistung: " + minLeistung + "%");
                    break;
                }
            }
            spiel++;
        }
    }
}