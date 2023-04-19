package com.pranrfl.getwell.BaseClass;


import java.util.Scanner;

public class JavaPercentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.println("Enter an operator (+, -, *, /, %):");
        char operator = input.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

        input.close();
    }
}
