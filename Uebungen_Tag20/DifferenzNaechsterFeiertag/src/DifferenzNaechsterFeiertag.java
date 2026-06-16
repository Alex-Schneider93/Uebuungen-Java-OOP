import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DifferenzNaechsterFeiertag {

    LocalDate heute = LocalDate.now();
    private static final DateTimeFormatter formatterDeutsch = DateTimeFormatter.ofPattern("dd.MM.yyyy");


    static String frageFeiertagsName() {
        String feiertagsName = JOptionPane.showInputDialog("Bitte gib den Namen des Feiertags ein:");
        while (feiertagsName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fehler beim Eingabe vom Feiertagsname");
        }

        return feiertagsName;
    }

    public static LocalDate frageDatum() {
        while (true) {
            String eingabe = JOptionPane.showInputDialog("Bitte gib den Datum eingeben(TT.MM.JJJJ: ");
            try {
                return LocalDate.parse(eingabe, formatterDeutsch);
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Falsches Datumsformat. Bitte TT.MM.JJJJ verwenden.");
            }
        }
    }


    public static LocalDate feiertagVorbei(LocalDate heute, LocalDate feiertagsDatum) {

        LocalDate korrigiertesDatum = feiertagsDatum.withYear(heute.getYear());

        if (heute.isAfter(korrigiertesDatum)) {
            return korrigiertesDatum.plusYears(1);
        }

        return korrigiertesDatum;
    }


    

}



