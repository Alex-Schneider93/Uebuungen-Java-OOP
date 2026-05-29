package paket_class;

import java.util.Scanner;

public class Programm
{
    public static void main(String[] args)
    {
        //um ein Objekt zu erzeugen, brauchen wir einen Konstruktor
        Artikel obj = new Artikel(1,"hose", 23.45, 10);
        Artikel obj1 = new Artikel(2,"hemd", 19.99, 12);

        System.out.println(obj.bezeichnung);
        System.out.println(obj.menge);
        System.out.println(obj.preis);

        double wert = obj.preis * obj.menge;

        //Ändern des Preises
        obj.preis = 27.65;

        //ich möchte 7 Hosen verkaufen

        boolean geht = obj.verkaufen(7);
        if(geht)
        {
            System.out.println("Verkauft");
        }
        else
        {
            System.out.println("Geh weg");
        }


        Scanner eingabe = new Scanner(System.in);
        System.out.print("Artikel wählen '1' für:" +
                obj.bezeichnung + " und '2' für: " + obj1.bezeichnung + ". : ");

        int artikel = eingabe.nextInt();




    }
}
