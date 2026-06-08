public class Immobilie extends Besitz{

    private double quadratmeter;
    private double qmPreis;

    public Immobilie(String bezeichnung, double quadratmeter, double qmPreis) {
        super(bezeichnung);
        this.quadratmeter = quadratmeter;
        this.qmPreis = qmPreis;
    }

    public double getQuadratmeter() {
        return quadratmeter;
    }

    public void setQuadratmeter(double quadratmeter) {
        this.quadratmeter = quadratmeter;
    }

    public double getQmPreis() {
        return qmPreis;
    }

    public void setQmPreis(double qmPreis) {
        this.qmPreis = qmPreis;
    }

    @Override
    public String toString() {
        return "Typ: Immobilien" + "\n" +
                "Nummer: " + getBuchstabe() + "\n" +
                "Bezeichnung: " + getBezeichnung() + "\n" +
                "Preis per qm: " + qmPreis + "\n" +
                "quadratmeter: " + quadratmeter + "\n" +
                "qmPreis: " + qmPreis;

    }

    @Override
    public double berechneWert() {
        return quadratmeter * qmPreis;
    }


}
