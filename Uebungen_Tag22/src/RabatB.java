public class RabatB implements RabattStrategie{


    @Override
    public double berechneEndpreis(double preis) {
        return preis - 5;
    }
}
