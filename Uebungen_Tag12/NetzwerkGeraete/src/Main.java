public class Main {
    public  static void main(String[] args) {
        Netzwerkgeraet g1 = new Netzwerkgeraet("172.101.189.5");
        Router r1 = new Router("172.101.189.4", 45);
        Switch s1 = new Switch("172.101.189.4", 45);
        AccessPoint a1 = new AccessPoint("172.101.189.9", 200);


        System.out.println(g1);  // toString wird automatisch aufgerufen.
        System.out.println("---------------------------------------------");

        System.out.println(r1);
        System.out.println("---------------------------------------------");

        System.out.println(s1);
        System.out.println("---------------------------------------------");

        System.out.println(a1);




    }
}
