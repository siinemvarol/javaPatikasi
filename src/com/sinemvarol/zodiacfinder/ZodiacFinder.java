package com.sinemvarol.zodiacfinder;

import java.util.Scanner;

public class ZodiacFinder {

    public static void main(String[] args) {
        int month;
        int day;
        String zodiac = "";
        boolean isValid = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of the month you were born in: ");
        month = scanner.nextInt();
        System.out.println("Number of the day you were born in: ");
        day = scanner.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 21) {
                zodiac = "Capricorn";
            } else if (day > 21 && day <= 31) {
                zodiac = "Aquarius";
            } else {
                isValid = false;
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 19) {
                zodiac = "Aquarius";
            } else if (day > 19 && day <= 29) {
                zodiac = "Pisces";
            } else {
                isValid = false;
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 20) {
                zodiac = "Pisces";
            } else if (day > 20 && day <= 31) {
                zodiac = "Aries";
            } else {
                isValid = false;
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 20) {
                zodiac = "Aries";
            } else if (day > 20 && day <= 30) {
                zodiac = "Taurus";
            } else {
                isValid = false;
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 21) {
                zodiac = "Taurus";
            } else if (day > 21 && day <= 31) {
                zodiac = "Gemini";
            } else {
                isValid = false;
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 22) {
                zodiac = "Gemini";
            } else if (day > 22 && day <= 30) {
                zodiac = "Cancer";
            } else {
                isValid = false;
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 22) {
                zodiac = "Cancer";
            } else if (day > 22 && day <= 31) {
                zodiac = "Leo";
            } else {
                isValid = false;
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 22) {
                zodiac = "Leo";
            } else if (day > 22 && day <= 31) {
                zodiac = "Virgo";
            } else {
                isValid = false;
            }
        } else if (month == 9) {
            if (day >= 1 && day <= 22) {
                zodiac = "Virgo";
            } else if (day > 22 && day <= 30) {
                zodiac = "Libra";
            } else {
                isValid = false;
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 22) {
                zodiac = "Libra";
            } else if (day > 22 && day <= 31) {
                zodiac = "Scorpio";
            } else {
                isValid = false;
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 21) {
                zodiac = "Scorpio";
            } else if (day > 21 && day <= 30) {
                zodiac = "Sagittarius";
            } else {
                isValid = false;
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 21) {
                zodiac = "Sagittarius ";
            } else if (day > 21 && day <= 31) {
                zodiac = "Capricorn";
            } else {
                isValid = false;
            }
        } else {
            isValid = false;
        }

        if (isValid) {
            System.out.println("Zodiac sign is: " + zodiac);
        } else {
            System.out.println("Entered date is not valid.");
        }
    }
}
