public class Auto extends Fahrzeug {

    // jedes Auto hat vier Räder
    public static final int anzahlRaeder = 4;


    // Konstruktor, in der Oberklasse ist festgelegt, dass jedes Fahrzeug eine Farbe hat
    public Auto(String farbe) {
        super(farbe);
    }

    // 'man muss die abstrakte Methode aus der Oberklasse überschreiben

    @Override
    public String fahren(){
        return "Auto nach ";
    }
}
