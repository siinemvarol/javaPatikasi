package com.sinemvarol.activityrecommendation;

import java.util.Scanner;

public class ActivityRecommendation {

    public static void main(String[] args) {

        int temperature;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter air temperature: ");
        temperature = scanner.nextInt();

        if (temperature < 5) {
            System.out.println("Skiing");
        } else if (temperature >= 5 && temperature <= 25) {
            if (temperature <= 15) {
                System.out.println("Going to the movies");
            } else {
                System.out.println("Picnic");
            }
        } else {
            System.out.println("Swimming");
        }
    }
}
