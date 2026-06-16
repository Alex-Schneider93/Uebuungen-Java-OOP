import javax.swing.*;

public class Pizza {
    private String name;

    public Pizza(String name) {
        this.name = name;
    }

    public String getProzess() {

        JOptionPane.showMessageDialog(null,
                "Die " + name + " wird zubereitet.\n" +
               "Die " + name + " wird im Ofen gebacken.\n" +
               "Die " + name + " wird geschnitten.\n" +
                "Die " + name + " wird verpackt.");
        return name;
    }
}