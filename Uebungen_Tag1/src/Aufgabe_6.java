import java.util.Objects;
import java.util.Scanner;

public class Aufgabe_6 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Variablen definieren
        double zahl_1;
        double zahl_2;
        String operator;


        System.out.println("Zahl 1: ");
        zahl_1 = input.nextDouble();
        System.out.println("Zahl 2: ");
        zahl_2 = input.nextDouble();
        System.out.println("Operator: +, -, *, /");
        operator = input.next();

        if (zahl_2 == 0 && operator.equals("/")) {
            System.out.println("Division durch 0 nicht erlaubt!");
        }else if (operator.equals("+")) {
            double ergebnis = zahl_1 + zahl_2;
            System.out.printf("%.2f + %.2f = %.2f", zahl_1, zahl_2, ergebnis);

        } else if (operator.equals("-")) {
            double ergebnis = zahl_1 - zahl_2;
            System.out.printf("%.2f - %.2f = %.2f",  zahl_1, zahl_2, ergebnis);
        }else if (operator.equals("*")) {
            double ergebnis = zahl_1 * zahl_2;
            System.out.printf("%.2f * %.2f = %.2f", zahl_1, zahl_2, ergebnis);
        }else if (operator.equals("/")) {
            double ergebnis = zahl_1 / zahl_2;
            System.out.printf("%.2f / %.2f = %.2f", zahl_1, zahl_2, ergebnis);
        }else{
            System.out.println("Falsche Eingabe!");
        }

        input.close();
    }
}
