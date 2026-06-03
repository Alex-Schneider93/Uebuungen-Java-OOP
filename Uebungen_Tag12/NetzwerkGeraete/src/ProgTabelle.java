public class ProgTabelle {
    public static void main(String[] args) {
        Netzwerkgeraet[] tabelle = new Netzwerkgeraet[6];

        tabelle[0] = new Router ("192.168.1.1", 50);
        tabelle[1] = new Router ("192.168.1.2", 51);
        tabelle[2] = new Switch ("192.168.1.3", 500);
        tabelle[3] = new Switch ("192.168.1.4", 450);
        tabelle[4] = new AccessPoint("192.168.1.5", 10);
        tabelle[5] = new AccessPoint ("192.168.1.6", 7);


        for (int i = 0; i < tabelle.length; i++) {
            System.out.println(tabelle[i] );
            System.out.println("-----------------------------------------------");
            System.out.println();
        }

        System.out.println("#############################################");

        for(Netzwerkgeraet geraet : tabelle) {
            System.out.println(geraet.machWas());
            System.out.println("Ip-Adresse: " + geraet.getIpAdresse());
            if (geraet instanceof Router) {
                Router cast = (Router) geraet;
                System.out.println("Router mit Ports: " + cast.getPorts());
                System.out.println();
            }else if (geraet instanceof Switch) {
                Switch cast = (Switch) geraet;
                System.out.println("Switch mit Datenübertragung: " + cast.getDatenverarbeitungskapazitaet() + " mb/s");
                System.out.println();
            }else if (geraet instanceof AccessPoint) {
                AccessPoint cast = (AccessPoint) geraet;
                System.out.println("AccessPoint mit Verbindungen Anzahl: " + cast.getVerbindungen());
                System.out.println();
            }
        }



    }
}
