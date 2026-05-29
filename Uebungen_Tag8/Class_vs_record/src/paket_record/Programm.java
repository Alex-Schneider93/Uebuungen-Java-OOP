package paket_record;

public class Programm
{
    public static void main(String[] args)
    {
        //ein record definiert automatisch einen Konstruktor
        Artikel obj = new Artikel(1, "hose", 23.45, 10);
        Artikel obj2 = new Artikel(2, "hemd", 20.19, 10);

        System.out.println(obj.bezeichnung());
        System.out.println(obj.preis());
        System.out.println(obj.menge());

        double wert = obj.preis() * obj.menge();

        //ich möchte den preis ändern
        //obj.preis() = 27.65;

    }
}
