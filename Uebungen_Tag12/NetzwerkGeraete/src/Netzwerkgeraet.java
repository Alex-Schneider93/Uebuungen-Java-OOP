// jede Klasse hat die Oberklasse objekt
public class Netzwerkgeraet {

    // jedes Gerät hat eine IP-Adresse
    private String ipAdresse;


    public Netzwerkgeraet(String inAdresse) {
        this.ipAdresse = inAdresse;
    }

    public String getIpAdresse() {
        return ipAdresse;
    }

    public void setIpAdresse(String ipAdresse) {
        this.ipAdresse = ipAdresse;
    }

    // Methode toString() wird überschrieben aus der Oberklasse objekt
    // damit wird festgelegt, was ausgegeben werden soll
    // ganz wichtig: der Name, die Übergabe und die Rückgabe sind festgelegt in der Oberklasse


    @Override
    public String toString() {
        return "Netzwerkgeraet: " + "\n" +
                "ipAdresse: " + ipAdresse;
    }


    public String machWas(){
        return "Netzwerkgerät steht rum";
    }
}
