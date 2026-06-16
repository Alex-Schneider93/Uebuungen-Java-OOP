import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Person> personen = new ArrayList<>();
        personen.add(new Lehrkraft("Herr Schmidt", 1001, "Mathematik"));
        personen.add(new Studierender("Max Mustermann", 2001, "Informatik 101"));
        personen.add(new Lehrkraft("Frau Müller", 1002, "Physik"));
        personen.add(new Studierender("Lisa Meier", 2002, "Chemie 101"));

        for (Person p : personen) {
            System.out.println(p);

            // Downcasting
            if (p instanceof Lehrkraft) {
                Lehrkraft cast = (Lehrkraft) p;
                System.out.println("Fach: " + cast.getFach());
            } else if (p instanceof Studierender) {
                Studierender cast = (Studierender) p;
                System.out.println("Kurs: " + cast.getKurs());
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------");


        List<Studierender> studierende = new ArrayList<>();
        for (Person p : personen) {
            if (p instanceof Studierender) {
                studierende.add((Studierender) p);
            }
        }


        Scanner input = new Scanner(System.in);
       int noteZahl = 0;


        for (int i = 0; i < personen.size(); i++) {
            // Prüfen, ob das aktuelle Objekt ein Studierender ist
            if (personen.get(i) instanceof Studierender) {
                Studierender s = (Studierender) personen.get(i);

                System.out.println("Noteneingabe für: " + s + "\nKurs: " + s.getKurs());


                while (true) {
                    noteZahl++;
                    System.out.print("Note '" + noteZahl + "' oder '0' zum beenden: ");

                    int eingabe = input.nextInt();
                    if (eingabe == 0) {
                        noteZahl = 0;
                        System.out.println("####################################################################");
                        break; // Beendet die while-Schleife für diesen Studenten
                    }

                    s.addNote(eingabe);
                }


                System.out.printf("Name: %s \nID:  %d: \nTyp: Student\nKurs: %s\nDurchschnittsnote: %.2f%n", s.getName(), s.getId(),s.getKurs(), s.getDurchschnitt());
                System.out.println("####################################################################");
            }
        }
        System.out.println("Keine Studenten mehr");
    }
}
