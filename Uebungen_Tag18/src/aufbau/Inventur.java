package aufbau;

public class Inventur {
    // Statischer Zähler, der klassenweit existiert, um jedem Objekt eine eindeutige Nr zu geben
    private static int zaehler = 1;

    // Instanzvariablen (Attribute) – hier werden die Daten für einen Artikel gespeichert
    private int nummer;
    private String artikel;
    private double einzelpreis;
    private int soll;
    private int ist;

    // Konstruktor: Wird aufgerufen, wenn ein neues Inventur-Objekt erstellt wird
    public Inventur(String artikel, double einzelpreis, int soll, int ist) {
        // Weist die aktuelle Nummer zu und erhöht den Zähler für das nächste Objekt
        this.nummer = zaehler++;
        this.artikel = artikel;
        this.einzelpreis = einzelpreis;
        this.soll = soll;
        this.ist = ist;
    }

    // Getter-Methoden: Erlauben den Lesezugriff auf private Variablen
    public int getNummer() {
        return nummer;
    }

    public String getArtikel() {
        return artikel;
    }

    public double getEinzelpreis() {
        return einzelpreis;
    }

    // Setter-Methode: Erlaubt das Ändern des Wertes nach der Erstellung
    public void setEinzelpreis(double einzelpreis) {
        this.einzelpreis = einzelpreis;
    }

    public int getSoll() {
        return soll;
    }

    public int getIst() {
        return ist;
    }

    public void setIst(int ist) {
        this.ist = ist;
    }

    // Delegiert die Berechnung an das Hilfsobjekt 'Verlust'
    public Verlust getVerlust() {
        return new Verlust(soll, ist);
    }

    // Überschreibt die Standard-toString Methode für eine lesbare Konsolenausgabe
    @Override
    public String toString() {
        return "Inventur{" +
                "nummer=" + nummer +
                ", artikel='" + artikel + '\'' +
                ", einzelpreis=" + einzelpreis +
                ", soll=" + soll +
                ", ist=" + ist +
                '}';
    }
}