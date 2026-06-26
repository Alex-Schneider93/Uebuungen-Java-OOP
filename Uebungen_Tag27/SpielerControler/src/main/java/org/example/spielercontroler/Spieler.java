package org.example.spielercontroler;

public class Spieler {
    private Integer id;
    private String name;
    private Integer level;
    private Integer punkte;

    public Spieler(int id, String name, int level, int punkte) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.punkte = punkte;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getPunkte() {
        return punkte;
    }


}