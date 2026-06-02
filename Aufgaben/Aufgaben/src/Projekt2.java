/*
Ziel
Das Programm soll solange nach einem Passwort fragen, bis "java" eingegeben wurde.

Gewünschte Ausgabe
Passwort:
test
Falsch!

Passwort:
hallo
Falsch!

Passwort:
java
Zugang erlaubt
 */

import java.util.Scanner;

public class Projekt2
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String passwort = "";

        while (passwort.equals("java")) {

            System.out.println("Passwort:");
            passwort = sc.nextLine();

            if (!passwort.equals("java")) {
                System.out.println("Falsch!");
            }
        }

        System.out.println("Zugang erlaubt");
    }
}
