package com.abzaman.testJava;

import java.util.Scanner;
import java.text.DecimalFormat;

public class BasicCalculatorWithFunction {

    // Defining functions for eich oparations
    public static String add(double x, double y) {
        double result = x + y;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        return df.format(result);
    }

    public static String multi(double x, double y) {
        double result = x * y;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        return df.format(result);
    }

    public static String sub(double x, double y) {
        double result = x - y;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        return df.format(result);
    }

    // public static String divide(double x, double y) throws ArithmeticException {
    // if (y == 0) {
    // throw new ArithmeticException("Cannot divide by zero");
    // }
    // double result = x / y;
    // DecimalFormat df = new DecimalFormat("#.##");
    // df.setMinimumFractionDigits(2);
    // df.setMaximumFractionDigits(2);
    // return df.format(result);
    // }

    public static String divide(double x, double y) {
        double result = x / y;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        return df.format(result);
    }

    public static String rem(double x, double y) {
        double result = x % y;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        return df.format(result);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String choice;
        int choice1;
        char a = 'y';

        while (Character.toLowerCase(a) == 'y') {

            System.out.println("Select operation.");
            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("5.Remainder\n");

            // Input validation for choice

            do {
                System.out.print("Enter choice(1/2/3/4):");
                choice = input.nextLine();
                try {
                    choice1 = Integer.parseInt(choice);
                    if (choice1 >= 1 && choice1 <= 5) {
                        break;
                    } else {
                        System.out.println("\nInvalid input!! Please enter a choice between 1 to 5 you FREAK !!!. \n");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("\nInvalid input. Please enter a choice between 1 to 5 you FREAK !!! \n");
                }
            } while (true);

            System.out.println("");

            double num1, num2;

            // Input validation for first number

            do {
                System.out.print("Enter first number:");
                choice = input.nextLine();
                try {
                    num1 = Integer.parseInt(choice);
                    break;

                } catch (NumberFormatException e) {
                    System.out.println(
                            "\n Invalid input!! Please enter value between an integer and double you NUMB !!! \n");
                }
            } while (true);

            System.out.println(" ");

            // validation for second number

            do {
                System.out.print("Enter second number:");
                choice = input.nextLine();
                try {
                    num2 = Integer.parseInt(choice);
                    break;

                } catch (NumberFormatException e) {
                    System.out.println("\n Invalid input!! Please enter value between an integer and double \n");
                }
            } while (true);

            System.out.println(" ");

            switch (choice1) {

                case 1:
                    System.out.println("\n" + num1 + " + " + num2 + " = " + add(num1, num2) + "\n");
                    break;

                case 2:
                    System.out.println("\n" + num1 + " - " + num2 + " = " + sub(num1, num2) + "\n");
                    break;

                case 3:
                    System.out.println("\n" + num1 + " x " + num2 + " = " + multi(num1, num2) + "\n");
                    break;

                case 4:
                    if (num2 != 0) {

                        System.out.println("\n" + num1 + " / " + num2 + " = " + divide(num1, num2) + "\n");
                    } else {
                        System.out.println("Syntax Error");
                    }
                    break;

                case 5:
                    System.out.println("\n" + num1 + " % " + num2 + " = " + rem(num1, num2) + "\n");
                    break;

                default:
                    System.out.println("Wrong input");

            }

            do {
                System.out.print("Do you wish to continue? Y/N ");
                choice = input.nextLine();

                if (choice.length() == 1) {
                    a = choice.charAt(0);

                    if (a == 'Y' || a == 'y') {
                        break;

                    } else if (a == 'N' || a == 'n') {
                        System.out.println("\nYou choose to quit..!! What a DUMBASS!! \n");
                        break;
                    }

                } else {
                    System.out.println("\nWrong choice!! \n");
                }

            } while (true);

            // a = input.next().charAt(0);

        }

    }
}
