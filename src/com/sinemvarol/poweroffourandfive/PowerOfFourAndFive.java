package com.sinemvarol.poweroffourandfive;

import java.util.Scanner;

public class PowerOfFourAndFive {
    public static void main(String[] args) {

        int powerOfFourCounter = 0;
        int powerOfFiveCounter = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i < number; i *= 4) {
            System.out.println("Power of four is: " + i + " Power is: " + powerOfFourCounter);
            powerOfFourCounter++;
        }
        System.out.println("* * * * * * * *");

        for (int i = 1; i < number; i *= 5) {
            System.out.println("Power of five is: " + i + " Power is: " + powerOfFiveCounter);
            powerOfFiveCounter++;
        }
    }
}
