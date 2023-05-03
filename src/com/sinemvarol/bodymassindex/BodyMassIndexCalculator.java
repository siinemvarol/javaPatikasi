package com.sinemvarol.bodymassindex;

import java.util.Scanner;

public class BodyMassIndexCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your height in cm: ");
        int height = scanner.nextInt();
        System.out.println("Please enter your weight in kg: ");
        int weight = scanner.nextInt();

        double bodyMassIndex = weight / ((height*0.01) * (height*0.01));

        System.out.println("Your Body Mass Index is: " + bodyMassIndex);

    }
}
