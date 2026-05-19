
import java.util.Random;
public class Aufgabe_9 {
    public static void main(String[] args) {
        Random random = new Random();
        int zufalszahl = random.nextInt(20)+1;

        System.out.println("Zufalszahl: " + zufalszahl);

        if (zufalszahl == 7){
            System.out.println("Eimer Kohle");
        } else if (zufalszahl >= 10 && zufalszahl <= 15) {
            System.out.println("Kugelschreiber");
        } else if (zufalszahl % 3 == 0) {
            System.out.println("topfpflanze");
        }else{
            System.out.println("Nichts");
        }

    }
}
