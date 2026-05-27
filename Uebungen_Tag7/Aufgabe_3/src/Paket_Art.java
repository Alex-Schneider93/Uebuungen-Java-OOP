public enum Paket_Art {
    STANDARD(4.99), EXPRES(9.99), PREMIUM(14.99);

    public double versandkosten;

    private Paket_Art(double versandkosten) {
        this.versandkosten = versandkosten;
    }
}





