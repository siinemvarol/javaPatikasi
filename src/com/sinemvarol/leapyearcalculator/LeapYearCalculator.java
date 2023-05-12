package com.sinemvarol.leapyearcalculator;

import java.util.Scanner;

public class LeapYearCalculator {

    public static void main(String[] args) {

        int year;
        boolean leapYear;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year: ");
        year = scanner.nextInt();

        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){
                    leapYear = true;
                } else {
                    leapYear = false;
                }
            } else {
                leapYear = true;
            }
        } else {
            leapYear = false;
        }

        if(leapYear){
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is not a leap year!");
        }
    }
}
