import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Berechtigung obj = new Berechtigung();
        boolean weiter = true;

        while (weiter) {
            String eingabe = JOptionPane.showInputDialog("Gib die Berechtigungen im UNIX-Stil ein (z.B. 755):");

            try {
                byte[] werte = obj.validieren(eingabe);
                String ausgabe = obj.rechteAusgabe(werte);
                JOptionPane.showMessageDialog(null, ausgabe, "Berechtigungen", JOptionPane.INFORMATION_MESSAGE);
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Fehler", JOptionPane.ERROR_MESSAGE);
            }

            int n = JOptionPane.showConfirmDialog(null, "Möchtest du eine weitere Berechtigung eingeben", "Weitere Eingabe", JOptionPane.YES_NO_OPTION);
            if (n != JOptionPane.YES_OPTION) {
                weiter = false;
            }
        }
    }
}