package com.sinemvarol.combinationcalculator;

import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {

        int factorialOfN = 1;
        int factorialOfR = 1;
        int factorialOfNMinusR = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of the set as 'n' : ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter combination size as 'r' : ");
        int r = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            factorialOfN = factorialOfN * i;
        }

        for (int i = 1; i <= r; i++) {
            factorialOfR = factorialOfR * i;
        }

        for (int i = 1; i <= (n - r); i++) {
            factorialOfNMinusR = factorialOfNMinusR * i;
        }

        int combination = factorialOfN / (factorialOfR * factorialOfNMinusR);

        System.out.println("C(n,r) = " + combination);
    }
}
