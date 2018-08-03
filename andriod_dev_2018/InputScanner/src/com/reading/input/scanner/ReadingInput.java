package com.reading.input.scanner;

import java.util.Scanner;

public class ReadingInput {

    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        String firstName;

        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        firstNumber = kb.nextInt();

        System.out.println("Please enter another number: ");
        secondNumber = kb.nextInt();

        kb.nextLine();
        System.out.println("Please enter your name: ");
        firstName = kb.nextLine();

        System.out.println(firstName + ", the total of two numbers is " + (firstNumber+secondNumber));

    }
}
