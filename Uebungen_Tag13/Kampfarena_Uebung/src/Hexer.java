public class Hexer extends Spieler {
    private String[] aktionen = {"Feuerball", "Blitzschlag", "Eissturm"};

    public Hexer(String name) {
        super(name);
    }

    @Override
    public double kaempfen() {
        int index = (int) (Math.random() * aktionen.length);
        String ausgewaehlteAktion = aktionen[index];
        double schaden = 0;

        switch (ausgewaehlteAktion) {
            case "Feuerball":
                schaden = 30;
                break;
            case "Blitzschlag":
                schaden = 25;
                break;
            case "Eissturm":
                schaden = 20;
                break;
        }

        System.out.println(getName() + " wirft " + ausgewaehlteAktion + " und verursacht " + schaden + "% Schaden!");
        return schaden;
    }
}