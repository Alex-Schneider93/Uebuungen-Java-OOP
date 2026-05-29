public class Taxi {

    //Klasseneigenschaft
    //Marke, der Wert ist für alle Objekte identisch, kann nicht geändert werden
    //Static: Diese Eigenschaft gehört zur Klasse - hat für alle Objekte den gleichen Wert
    //final: Konstante, der Wert kann nicht geändert werden
    // Zuweisung einer 0 -- es gibt noch keine Objekte
    static int anzahl = 0;
    static final String Marke = "Mercedes";

    // Klasseneigenschaft
    // Farbe, der Wert ist für alle Objekte identisch, kann geändert werden
    static String Farbe = "Beige";


    // Objekt Eigenschaften
    String nummer;
    String fahrer;
    double kmStand;
    Art art;


    //Standardkonstruktor, parameterlos
    //wenn kein anderer Konstruktor in dieser Klasse definiert, dann existiert dieser
    //wird verwendet, um den Objekteigenschaften Standard-Werte zuzuweisen

    Taxi(){
        anzahl++;
        this.nummer = "T" + anzahl;
        this.fahrer = "unbekannt";
        this.kmStand = 1.0;
        this.art = Art.NORMAL;
    }

    Taxi(String fahrer, double kmStand) {
        // mache erst mal den parameterlosen Standardkonstruktor (Constructor Chaining)
        this();
        // Diese Objekteigenschaft erhält den Wert, der im Konstruktor übergeben wurde
        this.fahrer = fahrer;
        this.kmStand = kmStand;

    }
    Taxi(String fahrer, double kmStand, Art art) {
        this();
        this.fahrer = fahrer;
        this.kmStand = kmStand;
        this.art = art;
    }



}


