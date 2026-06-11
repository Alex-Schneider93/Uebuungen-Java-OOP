package aufbau;

public class Wohnung {
    String w;
    static int nr = 0;
    String mieterName;
    double flaeche;
    double kaltmiete;
    double nebenkosten;

    public Wohnung(String mieterName, double flaeche, double kaltmiete, double nebenkosten) {
        nr++;
        this.w = "W" + nr;
        this.mieterName = mieterName;
        this.flaeche = flaeche;
        this.kaltmiete = kaltmiete;
        this.nebenkosten = nebenkosten;
    }

    public String getW() {
        return w;
    }

    public void setW(String w) {
        this.w = w;
    }

    public String getMieterName() {
        return mieterName;
    }

    public void setMieterName(String mieterName) {
        this.mieterName = mieterName;
    }

    public double getFlaeche() {
        return flaeche;
    }

    public void setFlaeche(double flaeche) {
        this.flaeche = flaeche;
    }

    public double getKaltmiete() {
        return kaltmiete;
    }

    public void setKaltmiete(double kaltmiete) {
        this.kaltmiete = kaltmiete;
    }

    public double getNebenkosten() {
        return nebenkosten;
    }

    public void setNebenkosten(double nebenkosten) {
        this.nebenkosten = nebenkosten;
    }

    public double summe (){
        return kaltmiete + nebenkosten;
    }

    public static int getNr() {
        return nr;
    }

    public static void setNr(int nr) {
        Wohnung.nr = nr;
    }

    public Wohnung(String nummer, String mieterName, double flaeche, double kaltmiete, double nebenkosten) {
        this(mieterName, flaeche, kaltmiete, nebenkosten);
        this.w = nummer;
    }

    public String toString() {
        return  "Wohnung: " + w + "\n" +
                "Mieter: " + mieterName + "\n" +
                "Fläche qm: " + flaeche + "\n" +
                "Kaltmiete: " + kaltmiete + "\n" +
                "Nebenkosten: " + nebenkosten + "\n" +
                "Summe: " +  summe();
    }
}