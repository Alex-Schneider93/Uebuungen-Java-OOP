import java.util.Scanner;

public class Aufgabe_6_Verschluesselung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String passwort;
        int index = 0;
        char zeichen;
        String verschluesselung = "";

        System.out.print("Passwort eingeben: ");
        passwort = scanner.nextLine();
        int anzahl = passwort.length();

        while(index < anzahl) {
            zeichen = passwort.charAt(index++);

            if (index %2 ==0) {
                zeichen = (char) (zeichen + 2);
            }else{
                zeichen = (char) (zeichen - 2);
            }
            verschluesselung += zeichen;
        }

        System.out.println("Passwort = " +  passwort);
        System.out.println("Verschlüssent = " + verschluesselung);
    }
}
