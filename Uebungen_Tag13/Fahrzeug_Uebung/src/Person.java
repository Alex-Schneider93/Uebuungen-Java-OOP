public class Person {

    private String name;
    private Fahrzeug fahrzeug;
    private Ziele ziele;

    public Person(String name, Ziele ziele) {
        this.name = name;
        this.ziele = ziele;
    }

    public Ziele getZiele() {
        return ziele;
    }

    public void setZiele(Ziele ziele) {
        this.ziele = ziele;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fahrzeug getFahrzeug() {
        return fahrzeug;
    }

    public void setFahrzeug(Fahrzeug fahrzeug) {
        this.fahrzeug = fahrzeug;
    }

    public String bewegen() {
        if (fahrzeug == null) {
            return name + " muss laufen";
        }
        double gesamtMinuten = 0;

        if (fahrzeug instanceof Auto) {
            gesamtMinuten = ziele.km * 1.0;
        } else if (fahrzeug instanceof Fahrrad) {
            gesamtMinuten = ziele.km * 5.0;
        } else if (fahrzeug instanceof Zug) {
            gesamtMinuten = ziele.km * 0.5;
        }

        int fahrZeitStunde = (int) (gesamtMinuten / 60);
        double fahrZeitMinuten = gesamtMinuten % 60;

        return name + " fährt mit " + fahrzeug.fahren() + " nach " + ziele + "\n" +
                "Fahrtzeit: " + fahrZeitStunde + " Stunden und " + fahrZeitMinuten + " Minuten";
    }
}