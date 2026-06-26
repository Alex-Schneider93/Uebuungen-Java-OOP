package org.example.demo;

import javafx.beans.InvalidationListener;
import javafx.beans.property.*;
import javafx.collections.ArrayChangeListener;
import javafx.collections.ObservableArray;

public class Seminar {
    private final StringProperty titel = new SimpleStringProperty();
    private final IntegerProperty id  = new SimpleIntegerProperty();
    private final DoubleProperty preis = new SimpleDoubleProperty();
    private final StringProperty kategorie = new SimpleStringProperty();


    public Seminar(int id, String titel, double preis, String kategorie) {
        this.id.set(id);
        this.titel.set(titel);
        this.preis.set(preis);
        this.kategorie.set(kategorie);
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getTitel() {
        return titel.get();
    }

    public void setTitel(String titel) {
        this.titel.set(titel);
    }

    public double getPreis() {
        return preis.get();
    }


    public void setPreis(double preis) {
        this.preis.set(preis);
    }

    public String getKategorie() {
        return kategorie.get();
    }

    public void setKategorie(String kategorie) {
        this.kategorie.set(kategorie);
    }



    public StringProperty titelProperty() {

        return titel;
    }
    public IntegerProperty idProperty() {
        return id;
    }
    public  DoubleProperty preisProperty() {
        return preis;
    }
    public StringProperty kategorieProperty() {
        return kategorie;
    }
}
