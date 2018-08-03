package com.compare.strings;

import javax.swing.*;

public class CompareStrings {
    public static void main(String[] args) {
        String name1;
        String name2;

        name1 = JOptionPane.showInputDialog("Enter a name");
        name2 = JOptionPane.showInputDialog("Enter another name");

        if(name1 != name2) //doesn't work as it's comparing memory locations
        {
            JOptionPane.showMessageDialog(null, "Didn't think this would work as you are trying to compare memory locations of two strings");
        }
        if(name1.equals(name2))
        {
            JOptionPane.showMessageDialog(null, "Equals Method: You entered two names that are the same");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Equals Method: You entered two names that are NOT the same");
        }

        int compareValue = name1.compareTo(name2);
        if(compareValue == 0)
        {
            JOptionPane.showMessageDialog(null, "ComparesTo Method: You entered two names that are the same");
        }
        else if(compareValue < 0)
        {
            JOptionPane.showMessageDialog(null, "ComparesTo Method: First name is smaller");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "ComparesTo Method: First name is bigger");
        }
        System.exit(0);
    }
}
