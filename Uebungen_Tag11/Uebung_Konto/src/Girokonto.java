public class Girokonto extends Konto {
    private double limit;

    public Girokonto(String kontonummer, double kontostand, double limit) {
        super(kontonummer, kontostand);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public String auszahlen(double betrag) {
        if (getKontostand() - betrag < -limit) {
            ;
            return "Fehler: Kreditlimit überschritten!\n"+
                    "Auszahlung nicht möglich.";
        } else {
            setKontostand(getKontostand() - betrag);
            return "Kontonummer: " + getKontonummer() + "\n" +
                    "Sie haben: " + betrag + " ausgezahlt\n" +
                    "Kontostand nach auszahlen: " + getKontostand();
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Kredit Limit: " + limit;
    }
}