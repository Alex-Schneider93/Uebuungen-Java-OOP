import java.util.Scanner;

public class Aufgabe_4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alter;
        IO.println("Gib dein Alter ein");
        alter = scanner.nextInt();

        if (alter < 0) {
            System.out.println("Unter 0 Geht nicht");
        } else if (alter >=65){
            IO.println("Du bist Senior");
        } else if (alter >= 19) {
            IO.println("Du bist Erwachsen");
        } else if (alter >=12) {
            IO.println("Du bist Teenager");
        } else{
            IO.println("Du bist Kind");
        }
        scanner.close();

    }
}
