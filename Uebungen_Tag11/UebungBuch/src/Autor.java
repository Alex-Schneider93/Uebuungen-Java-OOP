public class Autor {

    // Eigenschaften
    private String vorname;
    private String nachname;
    private String ort;


    // Konstruktor
    public Autor(String vorname, String nachname, String ort) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.ort = ort;
    }

    // alle drei Eigenschaften dürfen gelesen werden
    public String getVorname() {
        return vorname;
    }
    public String getNachname() {
        return nachname;
    }
    public String getOrt() {
        return ort;
    }

    // ein Ort kann sich ändern - Autor zieht um
    public void setOrt(String ort) {
        this.ort = ort;
    }

}
