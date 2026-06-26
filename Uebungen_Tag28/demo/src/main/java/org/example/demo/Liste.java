package org.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import org.w3c.dom.events.Event;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Liste {

    ObservableList<Seminar> oliste = FXCollections.observableArrayList();


    public void listeLaden() {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Java\\Seminare.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                oliste.add(new Seminar(
                        Integer.parseInt(data[0]),
                        data[1],
                        Double.parseDouble(data[2]),
                        data[3]
                ));
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }



    public void listeSpeichern() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Java\\Seminare.csv"))) {
            for (Seminar s : oliste) {
                bw.write(s.getId() + ";" + s.getTitel() + ";" + s.getPreis() + ";" + s.getKategorie());
                bw.newLine();
            }
        } catch (Exception e) {
           e.getMessage();
        }
    }



}
