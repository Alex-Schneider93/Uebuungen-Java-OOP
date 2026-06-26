public class RabatA implements RabattStrategie {


    @Override
    public double berechneEndpreis( double preis) {
       return preis * 0.90;
    }



}
