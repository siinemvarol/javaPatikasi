package com.sinemvarol.areaandperimeterofacircle;

import java.util.Scanner;

public class AreaAndPerimeterOfACircle {
    public static void main(String[] args) {

        int r;
        double pi = 3.14;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter radius of the circle: ");
        r = scanner.nextInt();

        double area = pi * r * r;
        double perimeter = 2 * pi * r;

        System.out.println("Area of the circle is: " + area);
        System.out.println("Perimeter of the circle is: " + perimeter);
    }
}
