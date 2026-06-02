public class Konto {
    private String kontonummer;
    private double kontostand;
    public double betrag;


    public Konto(String kontonummer, double kontostand) {
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(String kontonummer) {
        this.kontonummer = kontonummer;
    }

    public double getKontostand() {
        return  kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

   public String einzahlen(double betrag){
        kontostand = kontostand + betrag;
        return  "Kontonummer: " + kontonummer + "\n" +
                "Sie haben : " + betrag  + " eingezahlt\n" + "Kontostand nach Einzahlen: "+ kontostand;
   }
   public String auszahlen(double betrag) {
       if (betrag > kontostand) {
           kontostand = kontostand + betrag;
           return "Auszahlung überschreitet Kontostand";
       } else {
           kontostand = kontostand - betrag;
       }


       return "Kontonummer: " + kontonummer + "\n" +
               "Sie haben: " + betrag + " ausgezahlt\n" +
               "Kontostand nach auszahlen: " + kontostand;

   }

   @Override
    public String toString() {
    return "Kontonummer: " + kontonummer + "\n" +
            "Kontostand: " + kontostand + "\n";
   }

}
