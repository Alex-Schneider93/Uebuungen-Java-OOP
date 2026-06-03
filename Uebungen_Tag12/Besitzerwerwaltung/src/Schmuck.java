public class Schmuck extends Besitz{
    private Material material;
    private double gramm;

    public Schmuck(String bezeichnung, Material material, double gramm) {
        super(bezeichnung);
        this.material = material;
        this.gramm = gramm;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getGramm() {
        return gramm;
    }

    public void setGramm(double gramm) {
        this.gramm = gramm;
    }

    @Override
    public String toString() {
        return "Typ: Schmuck" + "\n" +
                "Bezeichnung: " + getBezeichnung() + "\n" +
                "Material: " + material + "\n" +
                "Preis per gramm: " + getMaterial().getWert()+ "\n" +
                "Gewicht: " + gramm + " gramm";

    }

    @Override
    public double berechneWert() {
     return gramm * material.getWert();
    }


}
