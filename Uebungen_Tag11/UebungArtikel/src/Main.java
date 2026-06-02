import java.io.PrintStream;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.io.PrintStream;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Artikel a1 = new Artikel("blubb", 1.99, 5);
        Kleidung k1 = new Kleidung("Hose", 23.45, 3, "L");
        Technik t1 = new Technik("Radio", 29.99, 8, "A");
        System.out.println("------------------------------------");
        System.out.println(a1);
        System.out.println("------------------------------------");
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(t1);
        var10000.println(var10001 + "\n" + t1.getEek());
        System.out.println("------------------------------------");
        var10000 = System.out;
        var10001 = String.valueOf(k1);
        var10000.println(var10001 + "\n" + k1.getGroesse());
    }
}
