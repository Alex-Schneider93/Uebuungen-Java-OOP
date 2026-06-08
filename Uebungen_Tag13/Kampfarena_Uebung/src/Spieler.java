public abstract class Spieler {
    private String name;
    private int leben;
    private double energie;

    public Spieler(String name) {
        this.name = name;
        this.leben = 3;
        this.energie = 100.0;
    }

    public String getName() {
        return name;
    }

    public int getLeben() {
        return leben;
    }

    public double getEnergie() {
        return energie;
    }

    public void setEnergie(double schaden) {
        this.energie = this.energie - schaden;

        if (this.energie < 20) {
            this.leben--;

            if (this.leben > 0) {
                this.energie = 100.0;
            } else {
                this.energie = 0;
            }
        }
    }

    public boolean istTot() {
        return this.leben <= 0;
    }

    public abstract double kaempfen();

    @Override
    public String toString() {
        return name + " | Leben: " + leben + " | Energie: " + energie + "%";
    }
}