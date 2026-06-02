
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Artikel {
    private String bezeichnung;
    private double preis;
    private int menge;
    private double warenwert;

    public Artikel(String bezeichnung, double preis, int menge) {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
        this.menge = menge;
    }

    public String getBezeichnung() {
        return this.bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public double getPreis() {
        return this.preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getMenge() {
        return this.menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public double getWarenwert() {
        return this.preis * (double)this.menge;
    }

    public void setWarenwert(double warenwert) {
        this.warenwert = warenwert;
    }

    public String toString() {
        String var10000 = this.bezeichnung;
        return "Artikel: " + var10000 + "\nPreis: " + this.preis + "\nMenge: " + this.menge + "\nWarenwert: " + this.getWarenwert();
    }
}
