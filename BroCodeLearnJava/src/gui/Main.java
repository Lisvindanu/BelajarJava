package gui;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter ur name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt( JOptionPane.showInputDialog("Enter ur age"));
        JOptionPane.showMessageDialog(null, "Your are " + age + "Year Old");

        double height = Double.parseDouble( JOptionPane.showInputDialog("Enter ur age"));
        JOptionPane.showMessageDialog(null, "Your are " + height + "cm tall");

    }



}
