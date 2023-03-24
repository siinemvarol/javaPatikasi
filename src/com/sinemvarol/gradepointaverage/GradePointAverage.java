package com.sinemvarol.gradepointaverage;

import java.util.Scanner;

public class GradePointAverage {
    public static void main(String[] args){

        int math;
        int physics;
        int chemistry;
        int turkish;
        int history;
        int music;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Math grade: ");
        math = scanner.nextInt();

        System.out.println("Physics grade: ");
        physics = scanner.nextInt();

        System.out.println("Chemistry grade: ");
        chemistry = scanner.nextInt();

        System.out.println("Turkish grade: ");
        turkish = scanner.nextInt();

        System.out.println("History grade: ");
        history = scanner.nextInt();

        System.out.println("Music grade: ");
        music = scanner.nextInt();

    int total = math + physics + chemistry + turkish + history + music;

    double average = total / 6.0;

    System.out.println("Your grand point average is: " + average);

    System.out.println((average > 60) ? "You passed." : "You failed");

    }

}