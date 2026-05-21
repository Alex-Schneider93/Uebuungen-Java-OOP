import java.util.Scanner;

/*
Ziel
Das Programm soll erst enden, wenn die Zahl 7 eingegeben wird.

Gewünschte Ausgabe
Zahl:
3
Falsch

Zahl:
8
Falsch

Zahl:
7
Richtig
 */
public class Projekt8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int zahl = 0;

        while (zahl != 7) {

            System.out.println("Zahl:");
            zahl = sc.nextInt();

            if (zahl != 5) {
                System.out.println("Falsch");
            }
        }

        System.out.println("Richtig");
    }
}
