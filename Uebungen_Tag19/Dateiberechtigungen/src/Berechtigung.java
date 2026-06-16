import javax.swing.JOptionPane;

public class Berechtigung {
    public byte[] validieren(String text) {
        if (text == null || text.length() != 3) {
            throw new IllegalArgumentException("Ungültige Eingebe. Die Zahl muss genau drei Ziffern enthalten.");
        }
        byte[] werte = new byte[3];
        for (int i = 0; i < 3; i++) {
            char c = text.charAt(i);
            if (c < '0' || c > '7') {
                throw new IllegalArgumentException("Ungültige Eingabe. Jede Ziffer muss zwischen 0 und 7 liegen");
            }
            werte[i] = Byte.valueOf(String.valueOf(c));
        }
        return werte;
    }
    public String rechteAusgabe(byte[] werte) {
        String[] rollen = {"Besitzer", "Gruppe", "Andere"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(rollen[i]).append(": ");
            int wert = werte[i];
            if ((wert & 4) != 0) sb.append("Lesen ");
            if ((wert & 2) != 0) sb.append("Schreiben ");
            if ((wert & 1) != 0) sb.append("Ausführen ");
            if (wert == 0) sb.append("Keine Berechtigung");
            sb.append("\n");
        }
        return sb.toString();
    }
}