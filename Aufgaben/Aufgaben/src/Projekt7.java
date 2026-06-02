import java.util.Scanner;

/*
Ziel
Das Menü soll erst beendet werden, wenn die Zahl 3 eingegeben wird.

Gewünschte Ausgabe
1 = Start
2 = Hilfe
3 = Ende
Auswahl:
1
Programm läuft

1 = Start
2 = Hilfe
3 = Ende
Auswahl:
2
Hilfe geöffnet

1 = Start
2 = Hilfe
3 = Ende
Auswahl:
3
Programm beendet
 */
public class Projekt7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int auswahl = 3;

        while (auswahl != 3) {

            System.out.println("1 = Start");
            System.out.println("2 = Hilfe");
            System.out.println("3 = Ende");

            System.out.println("Auswahl:");
            auswahl = sc.nextInt();

            if (auswahl == 1) {
                System.out.println("Programm läuft");
            } else if (auswahl == 2) {
                System.out.println("Hilfe geöffnet");
            }
        }

        System.out.println("Programm beendet");
    }
}
