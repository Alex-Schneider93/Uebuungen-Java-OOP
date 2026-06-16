package aufbau;

public record Verlust(double soll, double ist) {

    public double absolut() {
        return soll - ist;
    }

    public double relativ() {
        return (soll - ist) / soll * 100;
    }
}