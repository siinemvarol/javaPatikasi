package com.sinemvarol.userlogin;

import java.util.Scanner;

public class UserLogin {

    public static void main(String[] args) {

        String userName;
        String password;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Your username: ");
        userName = scanner.nextLine();

        System.out.println("Your password: ");
        password = scanner.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login information is not correct!");
        }


    }
}
