// Vererbungsbeziehung
// ein Router ist ein Netzwerkgerät
// erbt alles außer private
public class Router extends Netzwerkgeraet {

    private int ports;


    public Router(String ipAdresse, int port) {
        super(ipAdresse);
        this.ports = port;
    }

    public int getPorts() {
        return ports;
    }

    public void setPorts(int ports) {
        this.ports = ports;
    }


    // alle Eigenschaften ausgeben
    @Override
    public String toString() {
        return "Netzwergerät: Router\n" +
                "ipAdresse: " + getIpAdresse() + "\n" +
                "ports: " + ports;

    }

    @Override
    public String machWas() {
        return "Ein Router routet";
    }
}
