public class Buch {
    // Eigenschaften
    private String titel;
    private double preis;
    private Autor autor;


    // Konstruktor
    public Buch (String titel, double preis, Autor autor) {
        this.titel = titel;
        this.preis = preis;
        this.autor = autor;
    }

    // Ich kann alle Eigenschaften ausgeben lassen

    public double getPreis() {
        return preis;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getTitel() {
        return titel;
    }

    // Ich kann den Preis ändern
    public void setPreis(double preis) {
        this.preis = preis;
    }

}
