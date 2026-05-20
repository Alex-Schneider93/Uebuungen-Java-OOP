import java.util.Scanner;

public class Aufgabe_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gross = 0;
        int klein = 0;
        int ziffer = 0;
        int sonder = 0;
        int index = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Passwort eingeben: ");
        String passwort = scanner.nextLine();
        int anzahl = passwort.length();

        while (index < passwort.length()) {
            char zeichen = passwort.charAt(index);
            if (zeichen >= 'A' && zeichen <= 'Z') {
                gross++;
            } else if (zeichen >= 'a' && zeichen <= 'z') {
                klein++;
            } else if (zeichen >= '0' && zeichen <= '9') {
                ziffer++;
            } else if (zeichen == '$' || zeichen == '!') {
                sonder++;
            }
            index++;
        }

        if (gross > 0 && klein > 0 && ziffer > 0 && sonder > 0) {
            System.out.println("passwort ist ok");
        } else {
            System.out.println("passwort ist nicht ok");
        }




    }
}