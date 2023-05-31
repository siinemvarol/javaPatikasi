package com.sinemvarol.exponentialnumber;

import java.util.Scanner;

public class ExponentialNumber {
    public static void main(String[] args) {

        int number;
        int exponential;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        number = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter exponential: ");
        exponential = Integer.parseInt(scanner.nextLine());

        int result = 1;

        for(int i = 0; i < exponential; i++){
            result *= number;
        }
        System.out.println(number + " to the power of " + exponential + " is: " + result);

    }
}
