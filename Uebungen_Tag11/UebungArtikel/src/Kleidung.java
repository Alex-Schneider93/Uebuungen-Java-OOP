
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Kleidung extends Artikel {
    private String groesse;

    public Kleidung(String bezeichnung, double preis, int menge, String groesse) {
        super(bezeichnung, preis, menge);
        this.groesse = groesse;
    }

    public String getGroesse() {
        return "Größe: " + this.groesse;
    }

    public void setGroesse(String groesse) {
        this.groesse = groesse;
    }
}
