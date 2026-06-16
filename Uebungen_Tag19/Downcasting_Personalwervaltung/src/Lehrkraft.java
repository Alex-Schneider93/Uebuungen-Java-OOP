public class Lehrkraft extends Person {

   String fach;

    public Lehrkraft(String name, int id, String fach) {
        super(name, id);
        this.fach = fach;
    }

    public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }

    @Override
    public String toString() {
        return "Person: " + name + ", Id: " + id + "\nTyp: Lehrkraft";
    }
}
