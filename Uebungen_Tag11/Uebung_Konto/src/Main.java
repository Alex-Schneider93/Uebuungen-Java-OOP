public class Main {
    public static void main(String[] args) {


        Konto konto1 = new Konto("4454", 1300);
        Girokonto giro1 = new Girokonto("7654", 1500,500);


        System.out.println("-------Giro Konto auszahlen--------");
        System.out.println(giro1.auszahlen(2000));
        System.out.println();
        System.out.println(giro1);
        System.out.println();
        System.out.println("-------Giro Konto einzahlen--------");
        System.out.println(giro1.einzahlen(6000));
        System.out.println();
        System.out.println(giro1);
        System.out.println();
        System.out.println("-------Giro konto erneut auszahlen---------");
        System.out.println(giro1);
        System.out.println();
        System.out.println(giro1.auszahlen(55500));
        System.out.println();
        System.out.println(giro1);


    }
}
