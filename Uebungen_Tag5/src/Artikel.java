public record Artikel(String bezeichnung, double preis, int menge, String kategorie) {

    public double getWarenwert() {
        return preis * menge;
    }
    public String getkategorie() {
        return kategorie;
    }
  


}
