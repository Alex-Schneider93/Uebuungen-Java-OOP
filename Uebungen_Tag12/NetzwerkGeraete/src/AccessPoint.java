public class AccessPoint extends Netzwerkgeraet {
    private int verbindungen;

    public AccessPoint(String ipAdresse, int verbindungen) {
        super(ipAdresse);
        this.verbindungen = verbindungen;
    }

    public int getVerbindungen() {
        return verbindungen;
    }

    public void setVerbindungen(int verbindungen) {
        this.verbindungen = verbindungen;
    }

    @Override
    public String toString() {
        return "Netzwergerät: AccessPoint\n" +
                "IP-Adresse: " + getIpAdresse() + "\n" +
                "verbindungen: " + verbindungen;

    }

    @Override
    public String machWas() {
        return "macht aus einem LAN-Kabel ein WLAN-Signal";
    }
}
