public class Switch extends Netzwerkgeraet{
    private double datenverarbeitungskapazitaet;

    public Switch(String ipAdresse, double datenverarbeitungskapazitaet) {
        super(ipAdresse);
        this.datenverarbeitungskapazitaet = datenverarbeitungskapazitaet;
    }

    public double getDatenverarbeitungskapazitaet() {
        return datenverarbeitungskapazitaet;
    }

    public void setDatenverarbeitungskapazitaet(double datenverarbeitungskapazitaet) {
        this.datenverarbeitungskapazitaet = datenverarbeitungskapazitaet;
    }

    @Override
    public String toString() {
        return "Netzwergerät: Switch " + "\n" +
                "Ip-Adresse: " + getIpAdresse() + "\n" +
                "datenverarbeitungskapazitaet: " + datenverarbeitungskapazitaet + " mb/s" ;

    }

    @Override
    public String machWas() {
        return "Ein Switch verteilt die Daten";
    }
}
