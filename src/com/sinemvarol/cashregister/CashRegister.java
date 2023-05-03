package com.sinemvarol.cashregister;

import java.util.Scanner;

public class CashRegister {

    public static void main(String[] args) {

        double pear = 2.14;
        double apple = 3.67;
        double tomato = 1.11;
        double banana = 0.95;
        double eggplant = 5.00;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many KGs of pear do you want to buy?: ");
        int pearKg = scanner.nextInt();
        System.out.println("How many KGs of apple do you want to buy?: ");
        int appleKg = scanner.nextInt();
        System.out.println("How many KGs of tomato do you want to buy?: ");
        int tomatoKg = scanner.nextInt();
        System.out.println("How many KGs of banana do you want to buy?: ");
        int bananaKg = scanner.nextInt();
        System.out.println("How many KGs of eggplant do you want to buy?: ");
        int eggplantKg = scanner.nextInt();

        double total= (pear * pearKg) + (apple * appleKg) + (tomato * tomatoKg)
                + (banana * bananaKg) + (eggplant * eggplantKg);

        System.out.println("Total Price = " + total + " TL");

    }
}
