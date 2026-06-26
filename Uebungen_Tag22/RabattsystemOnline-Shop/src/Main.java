import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("Bitte geben sie den Preis an:");
        double preis = Double.parseDouble(input.nextLine());


        System.out.println("Bitte Rabattart wählen (A/B/C):");
        String art = input.nextLine();



        RabattStrategie strategie = switch (art) {
            case "A" -> new RabatA();
            case "B" -> new RabatB();
            case "C" -> new RabatC();
            default -> null;
        };

        System.out.println("Endpreis: " + strategie.berechneEndpreis(preis));
    }



}

