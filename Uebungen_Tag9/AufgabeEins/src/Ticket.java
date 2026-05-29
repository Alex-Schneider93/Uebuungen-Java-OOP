public class Ticket {

    String nummer;
    static int anzahl = 0;
    String band;
    double preis;
    int verkauft;
    Saal saal;

    Ticket() {
        anzahl++;
        this.nummer = "T" + anzahl;
        this.band = "Unbekannt";
        this.preis = 10;
        this.saal = Saal.KLEIN;
        this.verkauft = 0;

    }
    Ticket(String band, double preis, Saal saal, int verkauft) {
        this();
        this.band = band;
        this.preis = preis;
        this.saal = saal;
        this.verkauft = verkauft;
    }

    Ticket(Saal saal) {
        this();
        this.saal = saal;
    }

}
