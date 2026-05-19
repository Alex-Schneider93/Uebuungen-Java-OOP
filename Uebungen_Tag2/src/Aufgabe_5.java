import java.util.Scanner;

public class Aufgabe_5 {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        int stimmen = 10;
        int sabine = 0, malte = 0;

        String kandidat;

        do {
            System.out.println("Für Malte 'm',\nFür Sabine 's'");
            kandidat = eingabe.nextLine();
            stimmen -= 1;
            if (kandidat.equals("s")){
                sabine += 1;
            }else if (kandidat.equals("m")){
                malte += 1;
            }else if (!kandidat.equals("s") || !kandidat.equals("m")){
                    stimmen += 1;
                System.out.println("Falsche Eingabe");
            }
            System.out.println("Noch "+ stimmen + " Stimmen");
        }while (stimmen != 0);
        if (sabine > malte) {
            System.out.println("Sabine hat gewonnen! Punktzahl:  " + sabine);
            System.out.println("Malte Punktzahl:  " + malte);
        }else if (sabine < malte) {
            System.out.println("Malte hat gewonnen! Punktzahl:  " + malte);
            System.out.println("Sabine Punktzahl:  " + sabine);
        }else{

            System.out.println("Unenschieden!\nSabine Punktzahl:  " + sabine + "\nMalte Punktzahl: " + malte);
        }
        eingabe.close();
    }
}
