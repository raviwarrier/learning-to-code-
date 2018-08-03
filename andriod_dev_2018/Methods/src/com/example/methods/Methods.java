package com.example.methods;

import javax.swing.*;

public class Methods {

    /**
     * This is the main method and runs two methods - one to show the average from the method
     * and the other to return the value and then display it from the main method
     * @param args
     */
    public static void main(String[] args) {
        int a, b;

        a = Integer.parseInt(JOptionPane.showInputDialog("Enter value 1"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Enter value 2"));

        PrintAverage(a,b);

        a = Integer.parseInt(JOptionPane.showInputDialog("Enter value 1"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Enter value 2"));

        double c = ReturnAverage(a,b);
        JOptionPane.showMessageDialog(null,"The new average is " + c);
        System.exit(0);
    }

    /**
     * This prints the average within the method
     * @param v1 is the first integer
     * @param v2 is the second integer
     */
    public static void PrintAverage(int v1, int v2)
    {
        System.out.println("The Average is " + (double) (v1+v2)/2);
    }

    /**
     * This returns the average after calculating it
     * @param v1 is the first integer
     * @param v2 is the second integer
     * @return is the double value of the average of two integers passed as params
     */
    public static double ReturnAverage(int v1, int v2)
    {
        return (double) (v1+v2)/2;
    }
}
