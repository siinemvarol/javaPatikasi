package com.sinemvarol.taximetercalculator;

import java.util.Scanner;

public class TaximeterCalculator {

    public static void main(String[] args) {

        int km;
        double perKm = 2.20;
        double startingPrice = 10;
        double total = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter distance in KM: ");
        km = input.nextInt();

        total += (km * perKm) + startingPrice;

        total = (total < 20) ? 20 : total;

        System.out.println("Total price is: " + total);

    }
}
