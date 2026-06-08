public class Krieger extends Spieler {
    private String[] waffen = {"Schwert", "Axt", "Speer"};

    public Krieger(String name) {
        super(name);
    }

    @Override
    public double kaempfen() {
        int index = (int) (Math.random() * waffen.length);
        String ausgewaehlteWaffe = waffen[index];
        double schaden = 0;

        switch (ausgewaehlteWaffe) {
            case "Axt":
                schaden = 35;
                break;
            case "Schwert":
                schaden = 25;
                break;
            case "Speer":
                schaden = 20;
                break;
        }

        System.out.println(getName() + " greift mit " + ausgewaehlteWaffe + " an und verursacht " + schaden + "% Schaden!");
        return schaden;
    }
}