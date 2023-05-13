package com.sinemvarol.multiplieroffourcalculator;

import java.util.Scanner;

public class MultiplierOfFourCalculator {

    public static void main(String[] args) {

        int total = 0;
        int number;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please enter a number: ");
            number = scanner.nextInt();
            if(number%4 == 0){
                total += number;
            }

        } while (number %2 == 0);

        System.out.println("Total is: " + total);
    }
}
