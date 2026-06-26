package org.example.spielercontroler;

import java.util.ArrayList;

public class Tabelle {

    ArrayList<Spieler> spieler = new ArrayList<>();

    public Tabelle() {
        spieler.add(new Spieler(1, "Michael", 2, 2500));
        spieler.add(new Spieler(2, "Thomas", 3, 3500));
        spieler.add(new Spieler(3, "Richard", 4, 4500));
        spieler.add(new Spieler(4, "David", 5, 4500));
    }
}