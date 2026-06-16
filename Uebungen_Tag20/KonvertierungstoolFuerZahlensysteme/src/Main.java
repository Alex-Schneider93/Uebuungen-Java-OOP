import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        try {
            String input = JOptionPane.showInputDialog("Geben Sie eine Zahlein, die konvertiert werden soll:");
            int zahl = Integer.parseInt(input);

            String ausgabe = "Eingegebene Zahl: " + zahl + "\n" +
                    "Binär: " + Umwandlung.binaer(zahl) + "\n" +
                    "Oktal: " + Umwandlung.oktal(zahl) + "\n" +
                    "Hexadezimal: " + Umwandlung.hexadezimal(zahl);

            JOptionPane.showMessageDialog(null, ausgabe);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Ungültige Eingabe. Bitte geben Sie eine gültige Zahl im Bereich -2147483648 bis 2147483647 ein.",
                    "Fehler",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}