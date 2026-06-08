import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Scanner;

public class ListeLesen
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ordner: ");
        String ordner = sc.nextLine();

        System.out.print("Datei(.csv): ");
        String dateiName = sc.nextLine();

        Path datei = Paths.get("C:", "java", ordner, dateiName+ ".csv");

        NumberFormat format = NumberFormat.getInstance(Locale.GERMANY);
        try {
            List<String> zeilen = Files.readAllLines(datei);
            int Artikelnr = 0;
            double summe = 0;
            int maxAnzahl = 0;
            double maxUmsatz = 0;
            List<String> maxUmsatzListe = new ArrayList<>();
            List<String> maxArtikelListe = new ArrayList<>();

            for (String zeile : zeilen) {
                Artikelnr++;
                String[] werte = zeile.split(";");

                System.out.println("Artikel: " + Artikelnr + " " + werte[0]);

                int anzahl = Integer.parseInt(werte[1]);
                System.out.println("Stückzahl: " + anzahl);

                double preis = format.parse(werte[2]).doubleValue();
                System.out.println("Einzelpreis: " + preis);

                double gesamtpreis = (preis * anzahl);
                System.out.println("Gesamtpreis: " + gesamtpreis + "\n");

                summe += gesamtpreis;

                if (anzahl > maxAnzahl) {
                    maxAnzahl = anzahl;
                    maxArtikelListe.clear();
                    maxArtikelListe.add(werte[0]);
                } else if (anzahl == maxAnzahl) {
                    maxArtikelListe.add(werte[0]);
                }

                if(gesamtpreis > maxUmsatz){
                    maxUmsatz = gesamtpreis;
                    maxUmsatzListe.clear();
                    maxUmsatzListe.add(werte[0]);

                } else if (gesamtpreis==maxUmsatz) {
                    maxUmsatzListe.add(werte[0]);
                }
            }

            System.out.println("-----------------------------------------------");
            System.out.println("Gesamtsumme aller Artikel: " + summe);
            System.out.println("Höchste Gesamtmenge " +   maxArtikelListe + " mit " + maxAnzahl + " Stück");
            System.out.println("Höchste Umsatz " + maxUmsatzListe + " mit " + maxUmsatz + " €");
            System.out.println("*************************************\n");

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        try{
            List<String> zeilen = Files.readAllLines(datei);
            System.out.print("Artikel suchen: ");
            String suchbegriff = sc.nextLine().toLowerCase();

            for (int i = 0; i < zeilen.size(); i++) {
                String zeile = zeilen.get(i);
                String[] werte = zeile.split(";");
                String artikelName = werte[0].toLowerCase();
                if (artikelName.contains(suchbegriff)) {
                    System.out.println("Artikel: " + werte[0] + "\nAnzahl: " + werte[1] + "\nEinzelpreis:  " + werte[2] + "\n------------" );
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}