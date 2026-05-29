package paket_class;

public class Artikel
{
    //Eigenschaften
    int nr;
    String bezeichnung;
    double preis;
    int menge;

    //Konstruktor für die Erzeugung von Objekten
    Artikel(int nr, String bezeichnung, double preis, int menge)
    {
        //this -- DIESES Objekt hat die Eigenschaft bezeichnung und dort speichern den Wert
        this.nr = nr;
        this.bezeichnung = bezeichnung;
        this.preis = preis;
        this.menge = menge;

    }

    //ich möchte den Artikel verkaufen
    //ABER: verkaufen kann ich nur das, was im Lager ist
    //Beispiel: menge = 10 (im Lager), ich möchte verkaufen 12 --> geht nicht
    //Beispiel: menge = 10, ich möchte verkaufen 5 --> Alles ok, dann nur noch 5 im LAger
    //Funktion:
    //Übergabe: wie viele Artikel sollen verkauft werden (wunsch des Nutzers)

    boolean verkaufen(int wunsch)
    {
        //this -- egal welches Objekt, aber eines vom Typ Artikel
        if(this.menge >= wunsch)
        {
            this.menge -= wunsch;
            return true;
        }
            else
        {
            return false;
        }
    }
}
