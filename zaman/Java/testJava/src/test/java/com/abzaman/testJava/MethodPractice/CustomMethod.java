package com.abzaman.testJava.MethodPractice;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CustomMethod {
    public static int onlyIntegerInput(Scanner input) {

        int choice = 0;
        do {
            System.out.print("Enter an integer:\n");
            String inputStr = input.nextLine();
            try {
                choice = Integer.parseInt(inputStr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("\nInvalid input!! Please enter an integer.\n");
            }
        } while (true);
        return choice;
    }

    public static int firstNumberInput(Scanner input) {

        int num1 = 0;

        do {
            System.out.print("Enter first number:");
            String choice = input.nextLine();
            try {
                num1 = Integer.parseInt(choice);
                break;

            } catch (NumberFormatException e) {
                System.out.println("\n Invalid input!! Please enter value between an integer and double \n");
            }
        } while (true);
        return num1;

    }

    public static int secondNumberInput(Scanner input) {

        int num1 = 0;

        do {
            System.out.print("Enter second number:");
            String choice = input.nextLine();
            try {
                num1 = Integer.parseInt(choice);
                break;

            } catch (NumberFormatException e) {
                System.out.println("\n Invalid input!! Please enter value between an integer and double \n");
            }
        } while (true);
        return num1;

    }

    public static String add(double x, double y) {
        double result = x + y;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        return df.format(result);
    }
}
