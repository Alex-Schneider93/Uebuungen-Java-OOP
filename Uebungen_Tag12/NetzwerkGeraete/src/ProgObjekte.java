public class ProgObjekte {
    public static void main(String[] args) {
        // der normale Weg
        // der Typ des Objekts r1 un der Konstruktor kommen aus der gleichen Kalasse

        Router r1 = new Router("172.189.10.55", 50);

        Netzwerkgeraet g1  = new Router("172.189.10.56", 50);
        Router cast = (Router)g1;

         if (g1 instanceof  Router){
             Router c1 = (Router)g1;
             System.out.println("IP-Adresse: " + c1.getIpAdresse());
             System.out.println("ports: " + c1.getPorts());
         }else{
             System.out.println("g1 ist kein Router");
         }



    }
}
