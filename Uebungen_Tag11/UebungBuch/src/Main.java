public class Main {
    public static void main(String[] args) {

        // ich erstelle ein Objekt der Klasse Buch
        // jedes Buch hat einen Autor
        Autor autor = new Autor("Max", "Muster", "Berlin");

        // Jetzt kann ich ein Buch erstellen
        Buch b1 = new Buch("Die Axt im Walde", 49.99, autor);

        System.out.println("Buch 1-----------------------");
        System.out.println("Buch Titel: " + b1.getTitel());
        System.out.println("Preis: " + b1.getPreis());
        System.out.println("Autor Name: " + b1.getAutor().getVorname() + " " + b1.getAutor().getNachname());
        System.out.println("Ort: " + b1.getAutor().getOrt());
        System.out.println();

        Buch b2 = new Buch("Auf Wolke 7", 29.99, new Autor("Susi", "Sorglos", "Kiel"));
        System.out.println("Buch 2-----------------------");
        System.out.println("Buch Titel: " + b2.getTitel());
        System.out.println("Preis: " + b2.getPreis());
        System.out.println("Autor Name: " + b2.getAutor().getVorname() + " " + b2.getAutor().getNachname());
        System.out.println("Ort: " + b2.getAutor().getOrt());


    }
}
