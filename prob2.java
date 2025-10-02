import javax.swing.JOptionPane;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    double finalPrice(String type, double value) {
        if (type.equalsIgnoreCase("electronics")) {
            return price + value; // add warranty fee
        } else if (type.equalsIgnoreCase("clothes")) {
            return price - value; // subtract discount
        } else {
            return price; // no change
        }
    }
}

public class Prob2 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter product name:");
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter price:"));
        String type = JOptionPane.showInputDialog("Enter type (electronics/clothes):");
        double value = Double.parseDouble(JOptionPane.showInputDialog("Enter warranty fee or discount:"));

        Product p = new Product(name, price);

        JOptionPane.showMessageDialog(null,
            "Final Price of " + name + ": " + String.format("%.2f", p.finalPrice(type, value)));
    }
}
