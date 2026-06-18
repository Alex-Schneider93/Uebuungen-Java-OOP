import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        PizzaFactory pizzaFactory = new PizzaFactory();
        Restaurant restaurant = new Restaurant(pizzaFactory);


        String eingabe =  JOptionPane.showInputDialog("Bitte gib den Typ der Pizza ein (Salami, Spinat, Thunfisch:");

        pizzaFactory.erstellePizza(eingabe);
        restaurant.bestellePizza(eingabe);
    }
}
