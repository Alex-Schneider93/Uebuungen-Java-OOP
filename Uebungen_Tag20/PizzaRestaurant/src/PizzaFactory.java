public class PizzaFactory {
    public Pizza erstellePizza(String typ) {
        switch (typ) {
            case "Salami":
                return new Pizza("Salami Pizza");
            case "Spinat":
                return new Pizza("Spinat Pizza");
            case "Thunfisch":
                return new Pizza("Thunfisch Pizza");
            default:
                throw new IllegalArgumentException("Ungültiger Pizzatyp: " + typ);
        }
    }


}