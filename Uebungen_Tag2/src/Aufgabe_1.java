import java.util.Scanner;

public class Aufgabe_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int note;
        System.out.print("Geben Sie ihre note ein: ");
        note = input.nextInt();

        if (note <= 29){
            if (note < 0){
                System.out.println("negative Noten nicht erlaubt");
            }else{
                System.out.println("Ungenügend");
            }
        } else if (note <= 49) {
            System.out.println("Mangelhaft");
        }else if (note <= 66){
            System.out.println("Ausreichend");
        }else if (note <= 80){
            System.out.println("Befriedigend");
        }else if (note <= 91){
            System.out.println("Gut");
        }else if (note <= 100){
            System.out.println("Seht Gut");
        }else{
            System.out.println("Note über 100 nicht erlaubt");
        }
        input.close();

    }
}
