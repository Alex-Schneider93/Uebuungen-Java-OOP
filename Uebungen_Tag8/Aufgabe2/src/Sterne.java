public enum Sterne {
    EINS("einfache Ausstattung, grundlegender Komfort"),
    ZWEI("funktionale Ausstattung, kleiner Zusatzkomfort"),
    DREI("guter Komfort und erweiterter Service "),
    VIER("hoher Komfort, gehobene Ausstattung "),
    FUENF("Luxus-Hotel mit exklusivem Service und hochwertiger Ausstattung ");

    public String beschreibung;

    Sterne(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }
}
