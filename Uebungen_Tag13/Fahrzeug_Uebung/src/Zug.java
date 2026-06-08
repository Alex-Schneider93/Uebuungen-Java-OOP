public class Zug  extends Fahrzeug{
    public String gleis;

    public Zug(String farbe, String gleis) {
        super(farbe);
        this.gleis = gleis;
    }

    public String getGleis() {
        return gleis;
    }

    public void setGleis(String gleis) {
        this.gleis = gleis;
    }

    @Override
    public String fahren(){
        return "Zug ";
    }
}
