/*
Ziel
von 10 herunterzählen
die Zahl 5 überspringen

Gewünschte Ausgabe
10
9
8
7
6
4
3
2
1
Start!
 */
public class projekt4
{
    public static void main(String[] args) {

        int zahl = 10;

        while (zahl > 0) {

            if (zahl != 7) {
                System.out.println(zahl);
            }

            zahl--;
        }

        System.out.println("Start!");
    }
}

