public class Besitz {
    private String buchstabe;
    private String bezeichnung;
    static int nummer = 0;

    public Besitz(String bezeichnung) {
        nummer += 1;
        this.buchstabe = "B" + nummer;
        this.bezeichnung = bezeichnung;

    }

    public String getBuchstabe() {
        return buchstabe;
    }

    public void setBuchstabe(String buchstabe) {
        this.buchstabe = buchstabe;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public static int getNummer() {
        return nummer;
    }

    public static void setNummer(int nummer) {
        Besitz.nummer = nummer;
    }


    @Override
    public String toString() {
        return "Besitz{" +
                "Nummer='" + buchstabe + '\'' +
                ", Bezeichnung='" + bezeichnung + '\'' +
                '}';
    }

    public double berechneWert(){
        return 0;
    }



}
