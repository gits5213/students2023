package com.pranrfl.getwell.BaseClass;

import java.util.Scanner;

public class calculatorExercise {
    public static void main(String[] args) {

        Scanner calc = new Scanner(System.in);

        System.out.println("Enter The First Number: ");
        double calculator1 = calc.nextDouble();

        System.out.println("Enter The Second Number: ");
        double calculator2 = calc.nextDouble();

        System.out.println("Enter Operator(+,-,*,/): ");
        char operator = calc.next().charAt(0);

        double result = 0.0;


        switch (operator){
            case '+':
                result= calculator1 + calculator2;
                break;
            case '-':
                result= calculator1 - calculator2;
                break;
            case '*':
                result= calculator1 * calculator2;
                break;
            case '/':
                result= calculator1 / calculator2;
                break;
            default:
                System.out.println("Invalid Operation");
                break;
        }

        System.out.println(calculator1+" "+operator+" "+calculator2+"="+result);

        calc.close();
    }
}
