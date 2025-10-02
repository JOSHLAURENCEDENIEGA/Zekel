import javax.swing.JOptionPane;

class Manager {
    String name;
    double baseSalary;
    double allowance;

    Manager(String name, double baseSalary, double allowance) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.allowance = allowance;
    }

    double computeSalary() {
        return baseSalary + allowance;
    }
}

public class Prob1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Manager's name:");
        double base = Double.parseDouble(JOptionPane.showInputDialog("Enter base salary:"));
        double allowance = Double.parseDouble(JOptionPane.showInputDialog("Enter allowance:"));

        Manager m = new Manager(name, base, allowance);

        JOptionPane.showMessageDialog(null,
            "Total Salary of Manager " + name + ": " + String.format("%.2f", m.computeSalary()));
    }
}
