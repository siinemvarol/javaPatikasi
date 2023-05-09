package com.sinemvarol.ascendingsorting;

import java.util.Scanner;

public class AscendingSorting {

    public static void main(String[] args) {

        int number1;
        int number2;
        int number3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        number1 = scanner.nextInt();
        System.out.println("Please enter second number: ");
        number2 = scanner.nextInt();
        System.out.println("Please enter third number: ");
        number3 = scanner.nextInt();

        if((number1 < number2) && (number1 < number3)){
            if (number2 < number3){
                System.out.println(number1 + " < " + number2 + " < " + number3);
            } else {
                System.out.println(number1 + " < " + number3 + " < " + number2);
            }
        } else if((number2 < number1) && (number2 < number3)){
            if (number1 < number3){
                System.out.println(number2 + " < " + number1 + " < " + number3);
            } else {
                System.out.println(number2 + " < " + number3 + " < " + number1);
            }
        } else {
            if (number1 < number2){
                System.out.println(number3 + " < " + number1 + " < " + number2);
            } else {
                System.out.println(number3 + " < " + number2 + " < " + number1);
            }
        }

    }
}
