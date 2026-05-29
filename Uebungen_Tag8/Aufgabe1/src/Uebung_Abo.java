public class Uebung_Abo
{
    public static void main(String[] args)
    {
        Abonnent[] abonnenten = new Abonnent[8];

        abonnenten[0] =  new Abonnent(1001, "Müller", "Berlin", 34, Abomodell.ONLINE,Zahlweise.JAEHRLICH);
        abonnenten[1] =  new Abonnent(1002, "Schmidt", "Hamburg", 67, Abomodell.PRINT,Zahlweise.MONATLICH);
        abonnenten[2] = new Abonnent(1003, "Meier", "Berlin", 45, Abomodell.KOMBI, Zahlweise.JAEHRLICH);
        abonnenten[3] = new Abonnent(1004, "Fischer", "Leipzig", 29, Abomodell.ONLINE, Zahlweise.MONATLICH);
        abonnenten[4] = new Abonnent(1005, "Wagner", "Dresden", 71, Abomodell.WOCHENENDE,Zahlweise.MONATLICH);
        abonnenten[5] = new Abonnent(1006, "Schulz", "Hamburg", 52, Abomodell.KOMBI,Zahlweise.MONATLICH);
        abonnenten[6] = new Abonnent(1007, "Becker", "Berlin", 39, Abomodell.PRINT,Zahlweise.JAEHRLICH);
        abonnenten[7] = new Abonnent(1008, "Hoffmann", "Leipzig", 62, Abomodell.WOCHENENDE,Zahlweise.MONATLICH);

        int i = 0;
        System.out.println("-------- ALLE ABONNENTEN -------");
        while (i < abonnenten.length) {
            Abonnent a = abonnenten[i];
            System.out.println(
                    a.kundennr() + " | "
                            + a.name() + " | "
                            + a.ort() + " | "
                            + a.alter() + " Jahre | "
                            + a.abomodell() + "| "
                            + a.abomodell().preis + " EUR pro Monat."
            );
            i++;
        }
        System.out.println("----- MONATLICHE EINNAHMEN -----");
        double einnahmen = 0;
        i = 0;
        while (i < abonnenten.length) {
            Abonnent a = abonnenten[i];
            einnahmen += a.abomodell().preis;
            i++;
        }
        System.out.printf("Monatliche Einnahmen: %.2f €%n", einnahmen);
        System.out.println("--------- ANZAHL DER VERKAUFTEN ABO-MODELLE ----------");
        Abomodell[] modelle = Abomodell.values();
        for(int a = 0; a < modelle.length; a++) {
            int anzahl = 0;
            for(int j = 0; j < abonnenten.length; j++) {
                if (abonnenten[j].abomodell() == modelle[a]) {
                    anzahl++;
                }
            }
            System.out.println(modelle[a] + " : " + anzahl);
        }

    }
}