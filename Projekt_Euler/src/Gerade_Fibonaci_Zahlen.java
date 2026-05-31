public class Gerade_Fibonaci_Zahlen {
    public static void main(String[] args) {
        //Jedes neue Glied der Fibonacci-Folge entsteht durch Addition der beiden vorhergehenden Glieder.1 Und,2 der erste 10. Die Bedingungen lauten:
        // 1, 2, 3, 5, 8, 13, 21.......
        //Berechnen Sie die Summe der geraden Glieder der Fibonacci-Folge, indem Sie diejenigen Glieder betrachten, deren Werte vier Millionen nicht überschreiten.

                int a = 1;
                int b = 2;
                int summe = 0;

                while (a <= 4000000) {
                    if (a % 2 == 0) {
                        summe += a;
                    }
                    int naechste = a + b;
                    a = b;
                    b = naechste;
                }
                System.out.println(summe);
    }

}
