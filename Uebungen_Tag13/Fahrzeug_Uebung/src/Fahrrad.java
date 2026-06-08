public  class Fahrrad extends Fahrzeug {
    public static final int anzahlEarder = 2;

    public Fahrrad(String farbe) {
        super(farbe);
    }

    @Override
    public String fahren() {
        return "Fahrrad ";
    }
}
