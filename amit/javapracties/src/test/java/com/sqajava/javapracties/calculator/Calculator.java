package com.sqajava.javapracties.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter an integer between 1 and 5: ");
            int num = input.nextInt();

            double firstNum, secondNum, result;

            System.out.print("Enter first number: ");
            firstNum = input.nextDouble();

            System.out.print("Enter second number: ");
            secondNum = input.nextDouble();

            switch(num) {
                case 1:
                    result = firstNum + secondNum;
                    System.out.printf("%.1f + %.1f = %.1f\n", firstNum, secondNum, result);
                    break;
                case 2:
                    result = firstNum - secondNum;
                    System.out.printf("%.1f - %.1f = %.1f\n", firstNum, secondNum, result);
                    break;
                case 3:
                    result = firstNum * secondNum;
                    System.out.printf("%.1f * %.1f = %.1f\n", firstNum, secondNum, result);
                    break;
                case 4:
                    result = firstNum / secondNum;
                    System.out.printf("%.1f / %.1f = %.1f\n", firstNum, secondNum, result);
                    break;
                case 5:
                    result = firstNum % secondNum;
                    System.out.printf("%.1f %% %.1f = %.1f\n", firstNum, secondNum, result);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            System.out.print("Do you wish to continue? Y/N: ");
            choice = input.next().charAt(0);

            if (choice == 'Y' || choice == 'y') {
                continue; // restart the loop
            }

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Program terminated.");

    }
}




