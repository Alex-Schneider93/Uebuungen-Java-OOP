public enum Abomodell {

    ONLINE(9.99),
    PRINT(19.99),
    KOMBI(24.99),
    WOCHENENDE(14.99);

    public double preis;

    Abomodell(double preis) {
        this.preis = preis;
    }


}
