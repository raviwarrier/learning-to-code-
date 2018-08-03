package com.example;

public class Variables_Literals_Constants {
    public static void main(String[] args) {
        final int FIRSTNUMBER;
        int secondNumber;

        FIRSTNUMBER = 11;
        secondNumber = 20;

        double average;

        average = (double) (FIRSTNUMBER + secondNumber) / 2;

        System.out.println("Average: " + average);

        String firstName;
        String lastName;

        firstName = "Ravi";
        lastName = "Warrier";

        System.out.println(firstName + " " + lastName);

        boolean value;
        value = true;
        System.out.println(value);

        char letter;
        letter = 'M';

        System.out.println(letter);

    }
}
