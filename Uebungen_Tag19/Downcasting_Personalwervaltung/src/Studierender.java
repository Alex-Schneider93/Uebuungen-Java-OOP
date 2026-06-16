import java.util.ArrayList;
public class Studierender extends Person {
    String kurs;


    private ArrayList<Integer> noten;

    public Studierender(String name, int id, String kurs) {
        super(name, id);
        this.kurs = kurs;
        this.noten = new ArrayList<>();
    }

    public String getKurs() {
        return kurs;
    }

    public void setKurs(String kurs) {
        this.kurs = kurs;
    }

    @Override
    public String toString() {
        return "Person: " + name + ", Id: " + id + "\nTyp: Studierende";
    }


    public void addNote(int note) {
        this.noten.add(note);
    }

    public double getDurchschnitt() {
        if (noten.isEmpty()) return 0.0;
        double summe = 0;
        for (int n : noten) {
            summe += n;
        }
        return summe / noten.size();
    }


}
