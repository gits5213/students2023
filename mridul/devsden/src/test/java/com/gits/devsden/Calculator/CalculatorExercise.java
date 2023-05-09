package com.gits.devsden.Calculator;
import java.util.Scanner;
public class CalculatorExercise {
    public static void main(String[] args) {
        int num1,num2;
        String operator;
        int result = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operator :");
        operator = sc.next();
        System.out.println("Please enter the first number :");
        num1 = sc.nextInt();
        System.out.println("Please enter the second number :");
        num2 = sc.nextInt();
        sc.close();

        switch (operator){
            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                result = num1 / num2;
                break;

            case "%":
                result = num1 % num2;
                break;

            default:
                System.out.println("Error! Please enter the valid input.");
                break;
        }
        System.out.println("The result is :" +result);

    }

}
