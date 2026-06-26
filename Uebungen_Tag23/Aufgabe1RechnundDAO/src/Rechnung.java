import java.time.LocalDate;

public class Rechnung {
    private int id;
    private LocalDate datum;
    private double netto;
    private double steuersatz;
    private double brutto;


    public Rechnung(LocalDate datum, double netto, double steuersatz) {
        this.datum = datum;
        this.netto = netto;
        this.steuersatz = steuersatz;
        this.brutto = netto + (netto * steuersatz);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public double getNetto() {
        return netto;
    }

    public void setNetto(double netto) {
        this.netto = netto;
    }

    public double getSteuersatz() {
        return steuersatz;
    }

    public void setSteuersatz(double steuersatz) {
        this.steuersatz = steuersatz;
    }

    public double getBrutto() {
        return brutto;
    }

    public void setBrutto(double brutto) {
        this.brutto = brutto;
    }

    @Override
    public String toString() {
        return "Rechnung{" +
                "id=" + id +
                ", datum=" + datum +
                ", netto=" + netto +
                ", steuersatz=" + steuersatz +
                ", brutto=" + brutto +
                '}';
    }
}