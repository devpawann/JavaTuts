import javax.swing.*;

public class Prog611 {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("What is your name?");
        String input=JOptionPane.showInputDialog("Age?");
        int age=Integer.parseInt(input);
        System.out.println("Hello"+name);
    }
}

