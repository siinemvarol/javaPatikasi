package com.sinemvarol.ticketcalculator;

import java.util.Scanner;

public class TicketCalculator {

    public static void main(String[] args) {

        int distance;
        int age;
        int trip;
        double total = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter distance in km: ");
        distance = scanner.nextInt();
        System.out.println("Please enter your age: ");
        age = scanner.nextInt();
        System.out.println("Enter 1 for one-way ticket, 2 for round-trip: ");
        trip = scanner.nextInt();

        if (trip == 1 && distance > 0 && age > 0) {
            total = distance * 0.1;
        } else if (trip == 2 && distance > 0 && age > 0) {
            total = distance * 0.1 * 2;
        } else {
            System.out.println("Wrong input!");
        }

        if (age < 12) {
            total /= 2;
        } else if (age >= 12 && age <= 24) {
            total -= (total * 0.1);
        } else if (age > 65) {
            total -= (total * 0.3);
        }
        if (trip == 2) {
            total -= (total * 0.2);
        }
        System.out.println("Total Price: " + total);
    }
}
