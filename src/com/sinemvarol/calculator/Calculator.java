package com.sinemvarol.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int n1;
        int n2;
        int selection;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        n1 = scanner.nextInt();
        System.out.println("Please enter second number: ");
        n2 = scanner.nextInt();

        System.out.println("1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division");
        System.out.println("Your choice: ");
        selection = scanner.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Addition: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Subtraction: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Multiplication: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Division: " + (n1 / n2));
                } else {
                    System.out.println("A number cannot be divided by zero!");
                }
                break;
            default:
                System.out.println("Wrong input. Please try again.");
        }
    }
}
