// Das ist die Oberklasse
// Abstract: es können keine Objekte dieser Klasse erzeugt weden

public abstract class Fahrzeug {

    private String farbe;

    public Fahrzeug(String farbe) {
        this.farbe = farbe;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    // abstrakte Methode
    // legt fest, was mit jedem Fahrzeug gemacht werden kann, aber definiert nicht Wie
    // das müssen die Unterklassen machen mit überschrieben

    public abstract  String fahren();
}
