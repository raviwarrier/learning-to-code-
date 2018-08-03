package com.example.decisions;

import javax.swing.*;

public class Decisions {
    public static void main(String[] args) {
        int number;
        String input;

        input = JOptionPane.showInputDialog("Please enter a number");
        number = Integer.parseInt(input);

        if(number == 5) //equals to five
        {
            JOptionPane.showMessageDialog(null, "The number is five");
        }
        else if(number>5) //greater than five
        {
            JOptionPane.showMessageDialog(null, "The number is greater than five"
            );
        }
        else //less than five
        {
            JOptionPane.showMessageDialog(null, "The number is not greater than five"
            );
        }
        System.exit(0);
    }
}
