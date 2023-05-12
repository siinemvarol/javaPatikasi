package com.sinemvarol.calculatorforthreeandfour;

import java.util.Scanner;

public class CalculatorForThreeAndFour {
    public static void main(String[] args) {
        int number;
        double total = 0;
        int counter = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = scanner.nextInt();

        for (int i = 1; i < number; i++){
            if((i%3 == 0) && (i%4 == 0)){
                total += i;
                counter++;
            }
        }
        double average = total / counter;
        System.out.println("Average is: " + average);
    }
}
