package com.sinemvarol.gradepointcalc;

import java.util.Scanner;

public class GradePointCalculator {

    public static void main(String[] args) {

        int math;
        int physics;
        int turkish;
        int chemistry;
        int music;
        int counter = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Math grade: ");
        math = scanner.nextInt();
        if(math >= 0 && math <= 100){
            counter++;
        }

        System.out.println("Physics grade: ");
        physics = scanner.nextInt();
        if(physics >= 0 && physics <= 100){
            counter++;
        }

        System.out.println("Turkish grade: ");
        turkish = scanner.nextInt();
        if(turkish >= 0 && turkish <= 100){
            counter++;
        }

        System.out.println("Chemistry grade: ");
        chemistry = scanner.nextInt();
        if(chemistry >= 0 && chemistry <= 100){
            counter++;
        }

        System.out.println("Music grade: ");
        music = scanner.nextInt();
        if(music >= 0 && music <= 100){
            counter++;
        }

        double average = (math + physics + turkish + chemistry + music) / counter;
        if (average <= 55){
            System.out.println("You could not pass the year, see you next year!");
        } else {
            System.out.println("Congratulations! You passed the year.");
        }
        System.out.println("Grade Point: " + average);
    }
}
