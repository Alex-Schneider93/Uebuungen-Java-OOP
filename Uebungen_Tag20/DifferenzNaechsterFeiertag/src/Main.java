import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate heute = LocalDate.now();

        String nameFeiertag = DifferenzNaechsterFeiertag.frageFeiertagsName();

        LocalDate datumEingabe = DifferenzNaechsterFeiertag.frageDatum();

        int restTage = Math.toIntExact(datumEingabe.toEpochDay() - heute.toEpochDay());

        String ausgabe =    "Heute ist: " + heute.format(formatter) + "\n" +
                            "Feiertag: " + nameFeiertag + "\n" +
                            "Nächstes Feiertag: " + nameFeiertag + " am " + datumEingabe.format(formatter) + "\n"+
                            "Tage bis zum nächsten Feiertag : " + restTage;
        JOptionPane.showMessageDialog(null, ausgabe);




    }
}