public enum Material {
    GOLD(55.65), SILBER(1.1);

    private double wert;
    private Material(double wert){
        this.wert = wert;
    }

    public double getWert() {
        return wert;

    }
    public void setWert(double wert) {
        this.wert = wert;
    }
}
