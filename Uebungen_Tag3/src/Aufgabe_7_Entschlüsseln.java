import java.util.Scanner;

public class Aufgabe_7_Entschlüsseln {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String passwort;
        int index = 0;
        char zeichen;
        String verschluesselung = "";

        System.out.print("Passwort eingeben: ");
        passwort = scanner.nextLine();
        int anahl = passwort.length();

        while(index < anahl) {
            zeichen = passwort.charAt(index++);

            if (index %2 ==0) {
                zeichen = (char) (zeichen - 2);
            }else{
                zeichen = (char) (zeichen + 2);
            }
            verschluesselung += zeichen;
        }

        System.out.println("Verschlüsselt = " +  passwort);
        System.out.println("Entschlüsselt = " + verschluesselung);
    }
}

