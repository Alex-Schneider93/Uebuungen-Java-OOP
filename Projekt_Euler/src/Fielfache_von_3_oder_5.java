import com.sun.security.jgss.GSSUtil;

public class Fielfache_von_3_oder_5 {
    public static void main(String[] args) {
        //Wenn wir alle natürlichen Zahlen unten auflisten 10 die Vielfache von 3 oder 5, wir bekommen 3, 5, 6 und 9. Die Summe dieser Vielfachen ist 23 Die
        //Finde die Summe aller Vielfachen von 3 oder 5 unten 1000

        int zahlen = 0;
        int summe = 0;

        for (int i = 0; i < 1001; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                zahlen++;
                summe += i;
            }
        }
        System.out.println(summe);
    }
}
