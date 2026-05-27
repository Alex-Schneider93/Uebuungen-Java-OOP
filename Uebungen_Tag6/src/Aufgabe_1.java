public class Aufgabe_1 {
    public  static void main(String[] args) {
     /*   Aufgabe 1 - Analyse von Logdateien

        Ein Programm erhält folgende Meldungen:
       - Gib alle Meldungen aus

                - Zähle:

                --- INFO

                --- WARNUNG

                --- ERROR

                - Gib nur die Fehlermeldungen aus (ERROR)

                - Ermittle die längste Meldung

                - Ermittle die durchschnittliche Länge aller Meldungen

                - Prüfe, ob das Wort "Datenbank" vorkommt

                - ZUSATZ: der User gibt einen Suchbegriff ein, das Programm gibt alle Meldungen mit dem Suchbegriff aus
*/


        String[] logs = {

                "INFO: Benutzer angemeldet",

                "ERROR: Datenbankverbindung fehlgeschlagen",

                "WARNING: Speicher fast voll",

                "INFO: Datei gespeichert",

                "ERROR: Zugriff verweigert",

                "INFO: Benutzer abgemeldet"

        };

        int info = 0;
        int warn = 0;
        int error = 0;
        String laengste = "";




         //    --- INFO  Zählen -----
        for (int i = 0; i < logs.length; i++) {
            if  (logs[i].startsWith("INFO")){
                info++;
            }
        }

        //  --- WARNUNG Zählen ------
        for (int i = 0; i < logs.length; i++) {
            if  (logs[i].startsWith("WARNING")){
                warn++;
            }
        }



        System.out.println("Anzahl INFO -> " + info);
        System.out.println("Anzahl WARNING -> " + warn);



        //----ERROR AUSGABE-------
        System.out.println();
        System.out.println("-----ERROR AUSGABE---------");
        for (int i = 0; i < logs.length; i++) {
            if  (logs[i].startsWith("ERROR")){
                System.out.println(logs[i]);
                error++;
            }

        }
        System.out.println("Anzahl ERROR -> " + error);


        //-----Ermittle die längste Meldung -----
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].length() > laengste.length() ){
                laengste=logs[i];
            }

        }
        System.out.println();
        System.out.println("-----Längste Meldung---------");
        System.out.println("Längste Meldung -> " + laengste);


        //---Ermittle die durchschnittliche Länge aller Meldungen---



    }
}
