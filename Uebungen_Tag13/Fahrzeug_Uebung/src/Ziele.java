public enum Ziele {
    BERLIN(50),
    STUTTGART(25),
    MUENCHEN(75),
    PARIS(1500);

    public double km;

    Ziele(double km) {
        this.km = km;
    }
}