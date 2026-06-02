//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Benutzerkonto {
    String benutzername;
    String email;
    boolean aktiv;
    boolean validierung;

    public Benutzerkonto(String benutzername, String email) {
        this.benutzername = benutzername;
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBenutzername() {
        return this.benutzername;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }

    public String kontoaAktivieren() {
        this.aktiv = true;
        return "Das Benutzerkonto wurde aktiviert";
    }

    public String kontoDeaktivieren() {
        this.aktiv = false;
        return "Das Benutzerkonto wurde deaktiviert";
    }

    public String isAktiv() {
        return this.aktiv ? "JA" : "Nein";
    }

    public String zeigeStatus() {
        StringBuilder builder = new StringBuilder();
        builder.append("Benutzerkonto: " + this.benutzername + "\n");
        builder.append("E-Mail: " + this.email + "\n");
        builder.append("Konto Aktiv: " + this.isAktiv());
        return builder.toString();
    }

    public String aendereEmail(String neueEmail) {
        this.setEmail(neueEmail);
        this.validierung = true;
        return "Die E-Mail Adresse wurde erfolgreich geändert zu: " + neueEmail;
    }

    public String emailGeaendert() {
        return this.validierung ? "JA" : "Nein";
    }

    public String validiereBenutzernameUndEmail() {
        StringBuilder builder = new StringBuilder();
        builder.append("KontoValidierung mit : " + this.benutzername + ", " + this.email + "\n");
        builder.append("Validierung erfolgreich: " + this.emailGeaendert());
        return builder.toString();
    }
}
