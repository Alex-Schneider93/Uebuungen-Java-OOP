import javax.swing.*;

public class Restaurant {

    PizzaFactory  pizzaFactory = new PizzaFactory();

    public Restaurant(PizzaFactory factory) {
        this.pizzaFactory = factory;
    }

    public void bestellePizza(String typ) {
        Pizza pizza = pizzaFactory.erstellePizza(typ);
        pizza.getProzess();

    }
}