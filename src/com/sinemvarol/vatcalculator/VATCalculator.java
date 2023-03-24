package com.sinemvarol.vatcalculator;

import java.util.Scanner;
public class VATCalculator {

    public static void main(String[] args){

        double price;
        double vatRatio = 0;
        double vatAmount;
        double vatIncludedPrice;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter price without VAT: ");
        price = scanner.nextDouble();

        if(price > 0 && price <= 1000){
            vatRatio = 0.18;
        }
        if (price > 1000){
            vatRatio = 0.08;
        }
        vatAmount = vatRatio * price;
        vatIncludedPrice = price + vatAmount;

        System.out.println("Price without VAT: " + price);
        System.out.println("VAT ratio: " + vatRatio);
        System.out.println("VAT amount: " + vatAmount);
        System.out.println("VAT included price: " + vatIncludedPrice);

    }
}