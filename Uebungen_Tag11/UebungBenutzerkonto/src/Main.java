
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Benutzerkonto b1 = new Benutzerkonto("max.mustermann", "max.mustermann@example.com");
        new Benutzerkonto("alex.schnider", "alex.schneider@mail.com");
        System.out.println(b1.kontoaAktivieren());
        System.out.println(b1.zeigeStatus());
        System.out.println("---------------------------------");
        System.out.println(b1.kontoDeaktivieren());
        System.out.println(b1.zeigeStatus());
        System.out.println("---------------------------------");
        System.out.println(b1.aendereEmail("alex@mail.com"));
        System.out.println(b1.validiereBenutzernameUndEmail());
        System.out.println("---------------------------------");
    }
}
