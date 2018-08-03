package com.example.read.joptionpane;

import javax.swing.*;

public class ReadOptionPane {

    /**
     * This is the main method of the class
     * It takes three variables from the user using JOptionPane.showInputDialog.
     * The three variables are first name, last name and a number, and then displays
     * it back to the user using JOptionPane.showMessageDialog method.
     *
     * @param args This is just a placeholder for a dummy variable. Nothing needed here.
     */
    public static void main(String[] args) {

        String fName;
        String lName;

        fName = JOptionPane.showInputDialog("Please enter your first name");
        lName = JOptionPane.showInputDialog("Please enter your last name");

        String input;

        input = JOptionPane.showInputDialog("Enter a number");

        JOptionPane.showMessageDialog(null, "Your name is " + fName + " " + lName + " and you entered the number: " + input);

    }
}
