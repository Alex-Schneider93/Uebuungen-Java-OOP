public class Kreis {
    private double radius;
    private double umfang;
    private double flaeche;



    public Kreis(double radius){
        this.radius= radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getUmfang() {
        return umfang;
    }

    public void setUmfang(double umfang) {
        this.umfang = umfang;
    }

    public double getFlaeche() {
        return flaeche;
    }

    public void setFlaeche(double flaeche) {
        this.flaeche = flaeche;
    }

    public double berechneUmfang(){
        return 2 * Math.PI * this.radius;
    }

    public double berechneFlaeche(){
        return Math.PI * this.radius * this.radius;
    }



    public String zeigeErgebnisse() {
        StringBuilder sb = new StringBuilder();
        sb.append("Der Radius des Kreises beträgt: " + this.radius + "\n");
        sb.append("Der Umfang bertägt: " + berechneUmfang() + "\n");
        sb.append("Die Fläche beträgt: " + berechneFlaeche());
        return sb.toString();

    }
}