import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double aktuellerRadius = Double.parseDouble(JOptionPane.showInputDialog("Bitte gib den Startwert für den Radius ein:"));
        double erhoehung = Double.parseDouble(JOptionPane.showInputDialog("Bitte gib die Radiuserhöhung ein:"));

        String tabelle = "Radius\t| Umfang\t\t| Fläche\n---------------------------------------------------------------------------------------------\n";

        for (int i = 0; i < 30; i++) {
            Kreis k1 = new Kreis(aktuellerRadius);
            tabelle += aktuellerRadius + "\t|   " + k1.berechneUmfang() + "\t|   " + k1.berechneFlaeche()+ "\n";
            aktuellerRadius += erhoehung;
        }

        JOptionPane.showMessageDialog(null, new javax.swing.JTextArea(tabelle));
    }
}