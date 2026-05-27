
public record Artikel(String bezeichnung, double preis, int menge) {
    public double getWarenwert() {
        return preis * menge;
    }

}
