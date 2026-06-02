
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Technik extends Artikel {
    private String eek;

    public Technik(String bezeichnung, double preis, int menge, String eek) {
        super(bezeichnung, preis, menge);
        this.eek = eek;
    }

    public String getEek() {
        return "EEK: " + this.eek;
    }

    public void setEek(String eek) {
        this.eek = eek;
    }
}
