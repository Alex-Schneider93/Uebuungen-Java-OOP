import java.util.Scanner;

public class Aufgabe_2 {
    static void main(String[] args) {

        double aepfeln, birnen;
        Scanner scanner = new Scanner(System.in);

        IO.println("Äpfeln Anzahl eingeben:");
        aepfeln = scanner.nextDouble();

        IO.println("Birnen Anzahl eingeben:");
        birnen = scanner.nextDouble();

        double einzelPreisAepfel = 0.69;
        double einzelPreisBirnen = 0.89;

        double gesammtPreisBirnen = einzelPreisBirnen * birnen;
        double gesammtPreisAepfeln = einzelPreisAepfel * aepfeln;
        double gesammtSumme = gesammtPreisAepfeln +  gesammtPreisBirnen;

        System.out.printf("Gesammtpreis Birnen: %.2f \n" , gesammtPreisBirnen);
        System.out.printf("GesammtPreis Aepfel: %.2f \n" , gesammtPreisAepfeln);
        System.out.printf("Summe Äpfeln und Birnen: %.2f \n" , gesammtSumme);

        scanner.close();


    }

}
