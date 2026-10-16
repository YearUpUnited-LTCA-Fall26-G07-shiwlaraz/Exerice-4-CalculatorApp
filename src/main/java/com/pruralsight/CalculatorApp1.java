package com.pruralsight;

import java.util.Scanner;

public class CalculatorApp1 {

    public static void main(String[] args) {

        // Create Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for the first number
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        // Ask user for the second number
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Show available calculations
        System.out.println();
        System.out.println("Possible calculations:");
        System.out.println("(A) add");
        System.out.println("(S) subtract");
        System.out.println("(M) multiply");
        System.out.println("(D) divide");

        // Ask user to select an option
        System.out.print("Please select an option: ");
        String option = scanner.next();

        // Multiply the two numbers
        int result = firstNumber * secondNumber;

        // Display the equation and result
        System.out.println();
        System.out.println(firstNumber + " * " + secondNumber
                + " = " + result);

        scanner.close();
    }
}
