import java.util.Scanner;

public class Uebung_Vermietung {
    public static void main(String[] args) {
        Geraet was = Geraet.SUP;

        System.out.println(was);
        System.out.println(was.stundenpreis);
        was.stundenpreis = 15;
        System.out.println(was.stundenpreis);

        System.out.println();
        Vermietung[] tabelle = new Vermietung[5];
        tabelle[0] = new Vermietung("Sabine", 2, Geraet.SUP);
        tabelle[1] = new Vermietung("Ronny", 1, Geraet.BOOT);
        tabelle[2] = new Vermietung("Detlef", 1, Geraet.BOOT);
        tabelle[3] = new Vermietung("Olga", 3, Geraet.SUP);
        tabelle[4] = new Vermietung("Kim", 3, Geraet.SURFBRETT);


        for (int i = 0; i < tabelle.length; i++) {
            Vermietung zeile = tabelle[i];
            System.out.println("Kunde:" + zeile.kunde());
            System.out.println("Stunde:" + zeile.stunde());
            System.out.println("Gäret:" + zeile.was());
            System.out.println("Stundenpreis:" + zeile.was().stundenpreis + " €");
            double gesamt = zeile.stunde() * zeile.was().stundenpreis;
            double gesamtPreis = zeile.stunde() * zeile.was().stundenpreis;
            System.out.println("Gesamtpreis: " + gesamtPreis + " €");
            System.out.println("Gesamt: " + gesamt + " Stunden");
            System.out.println();
        }

        double gesamtUmsatz = 0;
        for (int i = 0; i < tabelle.length; i++) {
            Vermietung zeile = tabelle[i];
            double gesamtPreis = zeile.stunde() * zeile.was().stundenpreis;
            gesamtUmsatz += gesamtPreis;

        }
        System.out.println("Gesamt Umsatz: " + gesamtUmsatz);

        System.out.println();
        System.out.println("Vorhandene Geräte:");
        for (int i = 0; i < Geraet.values().length; i++) {
            System.out.print(Geraet.values()[i].name() + (i < Geraet.values().length - 1 ? ", " : ""));
        }
        System.out.print("\nWelches Gerät suchen Sie? : ");
        Scanner input = new Scanner(System.in);
        String eingabe = input.nextLine();

        double geraetUmsatz = 0;
        int stundenGesamt = 0;
        double prozentual = 0.0;

        for (Vermietung zeile : tabelle) {
            if (zeile.was().name().equalsIgnoreCase(eingabe)) {
                geraetUmsatz += zeile.stunde() * zeile.was().stundenpreis;
                stundenGesamt += zeile.stunde();
            }
        }
        prozentual = (geraetUmsatz / gesamtUmsatz * 100);
        System.out.println("Umsatz für " + eingabe + ": " + geraetUmsatz + " € ");
        System.out.printf("Prozentuale Umsatz: %.2f%%\n", prozentual);
        System.out.println("Gesamte Stunden für " + eingabe + ": " + stundenGesamt);
    }

    }




