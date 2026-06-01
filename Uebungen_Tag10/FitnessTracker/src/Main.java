import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //in der Klasse Benutzer steht drin, welche Eigenschaften zu einem Benutzer gehören
        //was muss bei Erstellen eines Datensatzes / Objektes beachten
        //was kann man machen mit dem Objekt

        //Eingabe der eigenschaften durch den Nutzer
     //   String name = "Max Mustermann";
      //  int alter = 33;
      //  double gewicht = 75;
       // double groesse = 183;

        //diese Eingaben werden nun verwendet, um einen Benutzer zu erstellen
        //wir erzeugen ein Objekt der Klasse benutzer


        //wir rufen eine methode auf von diesem objekt
        //diese methode verwendet die Eigenschaftswerte (die im Konstruktor übergeben wurden)
        //und rechnet etwas aus

        String name = JOptionPane.showInputDialog(null, "Name:");

        String alterStr = JOptionPane.showInputDialog(null, "Alter:");
        int alter = Integer.parseInt(alterStr);

        String gewichtStr = JOptionPane.showInputDialog(null, "Gewicht:");
        double gewicht = Double.parseDouble(gewichtStr);

        String groesseStr = JOptionPane.showInputDialog(null, "Groesse:");
        double groesse = Double.parseDouble(groesseStr);

        Benutzer obj = new Benutzer(name, alter, gewicht, groesse);

        double bmi = obj.berechneBMI();
        String text = obj.gesundheitsEmpfehlung();
        String textErweitert = obj.gesundheitsEmpfehlung(true);

        String ausgabe = String.format("Hallo %s\nIhr BMI beträgt: %.2f\n\nGesundheitsempfehlung:\n%s\n\nerweiterte Gesundheitsempfehlung:\n%s",
                name, bmi, text, textErweitert);

        JOptionPane.showMessageDialog(null, ausgabe);
    }
}