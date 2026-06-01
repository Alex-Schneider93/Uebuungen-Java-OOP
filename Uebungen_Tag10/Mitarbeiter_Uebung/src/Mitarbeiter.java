public class Mitarbeiter
{
    //Eigenschaften - Attribute
    private String mitarbeiterID;
    private String name;
    private String position;
    private double gehalt;
    private int erfahrungsjahre;

    //Standard-Konstruktor, parameterlos
    //die Eigenschaften erhalten Standardwerte
    public Mitarbeiter()
    {
        this.mitarbeiterID = "unbekannt";
        this.name = "unbekannt";
        this.position = "unbekannt";
        this.gehalt = 0;
        this.erfahrungsjahre = 0;
    }

    //Überladener Konstruktor
    //für Erzeugung eines Objekte müssen 3 Eigenschaften festgelegt werden, der Rest Standard
    public Mitarbeiter(String mitarbeiterID, String name, String position) {
        this.setMitarbeiterID(mitarbeiterID);
        this.name = name;
        this.position = position;
        this.gehalt = 0;
        this.erfahrungsjahre = 0;
    }

    public Mitarbeiter(String mitarbeiterID, String name, String position, double gehalt, int erfahrungsjahre) {
        this.setMitarbeiterID(mitarbeiterID);
        this.name = name;
        this.position = position;
        this.setGehalt(gehalt);
        this.setErfahrungsjahre(erfahrungsjahre);
    }

    public String getMitarbeiterID() {
        return mitarbeiterID;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setMitarbeiterID(String mitarbeiterID) {
        if(!mitarbeiterID.isEmpty()) {
            this.mitarbeiterID = mitarbeiterID;
        }
        else
        {
            System.out.println("MitarbeiterID is empty");
        }
    }

    public int getErfahrungsjahre() {
        return erfahrungsjahre;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    //Anforderung: prüfe, dass das neue Gehalt nicht negativ ist
    public void setGehalt(double gehalt) {
        if(gehalt > 0)
        {
            this.gehalt = gehalt;
        }
        else
        {
            System.out.println("Gehalt is kleiner 0");
        }
    }

    public void setErfahrungsjahre(int erfahrungsjahre) {
        if(erfahrungsjahre > 0) {
            this.erfahrungsjahre = erfahrungsjahre;
        }
        else
        {
            System.out.println("Erfahrungsjahre is kleiner 0");
        }
    }

    //eine Methode um alle Eigenschaftswerte auszugeben
    //Rückgabe String: der anzuzeigende Text
    //WICHTIG: keine direkte Ausgabe in den Klassen, denn Klassen gehören zur Bibliothek
    //und man weiß nie, welche Anwendung (Konsole, Grafik, dateien) am Ende verwendet werden
    public String zeigeInfo()
    {
        StringBuilder str = new StringBuilder();
        str.append("MitarbeiterID: " + mitarbeiterID + "\n");
        str.append("Name: " + name + "\n");
        str.append("Position: " + position + "\n");
        str.append("Gehalt: " + gehalt + "\n");
        str.append("Erfahrungsjahre: " + erfahrungsjahre + "\n");
        return str.toString();
    }

    public String zeigeInfoOhneGehalt()
    {
        StringBuilder str = new StringBuilder();
        str.append("MitarbeiterID: " + mitarbeiterID + "\n");
        str.append("Name: " + name + "\n");
        str.append("Position: " + position + "\n");
        str.append("Erfahrungsjahre: " + erfahrungsjahre + "\n");
        return str.toString();
    }

    public double berechneBonus()
    {
        return gehalt * 0.10;
    }

    public double berechneBonus(double faktor)
    {
        return gehalt * faktor;
    }

    public double berechneBonus(double faktor, double sonderzulage)
    {
        return gehalt * faktor + sonderzulage;
    }

}
