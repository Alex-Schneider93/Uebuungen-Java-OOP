import java.util.Scanner;

public class Aufgabe_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int punkte;

        System.out.print("Punktzahl eingeben: ");
        punkte = scanner.nextInt();

        switch (punkte){
            case 10:
                System.out.println("Note : 1 -> Sehr Gut");
                break;
            case 9:
                System.out.println("Note : 2 -> Gut");
                break;
            case 8:
                System.out.println("Note : 3 -> Befriedigend");
                break;
            case 7:
            case 6:
                System.out.println("Note : 4 -> Ausreichend");
                break;
            case 5,4,3,2,1,0:
                System.out.println("Note : 3 -> Ungenügend");
                break;
            default:
                System.out.println("Negative Punkte nicht erlaubt");
        }
        scanner.close();
    }
}
