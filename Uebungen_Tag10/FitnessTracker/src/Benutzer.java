public class Benutzer
{
    private String name;
    private int alter;
    private double gewicht;
    private double groesse;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && name.length() > 0) {
            this.name = name;
        }
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public double getGroesse() {
        return groesse;
    }

    public void setGroesse(double groesse) {
        this.groesse = groesse;
    }

    public Benutzer(String name, int alter, double gewicht, double groesse) {
        this.name = name;
        this.alter = alter;
        this.gewicht = gewicht;
        this.groesse = groesse;
    }

    public Benutzer(String name, int alter) {
        //Konstruktor Chaining
        this(name, alter, 70,170);
    }

    public double berechneBMI()
    {
        return gewicht / Math.pow(groesse/100,2);
    }

    public String gesundheitsEmpfehlung()
    {
        double bmi = berechneBMI();
        if(bmi < 18.5)
        {
            return "Untergewicht - Besprechen Sie Ihre Ziele mit einem Ernährungsberater.";
        }
        else if(bmi < 25) {
            return "Normalgewicht - Gute Arbeit, weiter so.";
        }
        else if(bmi < 29.9)
        {
            return "Übergewicht - Ein moderates Trainingsprogramm währe empfehlenswert.";
        }
        else
        {
            return "Adipositas - Professionelle Unterstützung könnte helfen, die Gesundheitsziele zu erreichen";
        }
    }

    public String gesundheitsEmpfehlung(boolean erweiterteEmpfehlung) {
        String ausgabe = gesundheitsEmpfehlung();
        if (erweiterteEmpfehlung) {
            if (alter < 18) {
                ausgabe += "\nDa Sie unetr 18 sind, sollten Sie Ihr Wachstum und Ihre Entwicklung berücksichtigen";
            } else if (alter <= 29) {
                ausgabe += "\nIn Ihrem Alter sind regelmäßige Bewegung und eine ausgewogene Ernährung besonders wichtig";
            } else if (alter <= 49) {
                ausgabe += "\nHalten Sie ein ausgewogenes Verhältnis von Bewegung und Ernährung, um langfristig fit zu bleiben";
            } else {
                ausgabe += "\nRegalmäßige Bewegung zur Gelenkgesundheit ist besonders wichtig";
            }

        }
        return ausgabe;
    }


}
