package com.sinemvarol.findinghypotenuse;

import java.util.Scanner;
public class FindingHypotenuse {

        public static void main(String[] args){

            double side1, side2, hypotenuse;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter first side of triangle: ");
            side1 = scanner.nextDouble();

            System.out.println("Please enter second side of triangle: ");
            side2 = scanner.nextDouble();

            hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);

            System.out.println("Hypotenuse: " + hypotenuse);
        }

}