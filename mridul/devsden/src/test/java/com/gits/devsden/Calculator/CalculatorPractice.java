package com.gits.devsden.Calculator;
import java.util.Scanner;
public class CalculatorPractice {
    public static void main(String[] args) {

        char operator;
        double number1, number2,result =0.0;

        Scanner input = new Scanner(System.in);
        System.out.println("Choose an operator(+,-,* or /): ");
        operator = input.next().charAt(0);
        System.out.println("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case'*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            default:
                System.out.println("Error!Please Enter the valid input.");
                break;
        }
        System.out.println(operator+ " "+num1+" "+num2+"="+result);

        input.close();

    }
}
