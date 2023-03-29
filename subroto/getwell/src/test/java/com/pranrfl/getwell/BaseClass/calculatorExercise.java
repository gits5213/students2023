package com.pranrfl.getwell.BaseClass;

import java.util.Scanner;

public class calculatorExercise {
    public static void main(String[] args) {

        Scanner calc = new Scanner(System.in);
        //(System.in) universally accessible InputStream that use to read input from the terminal window

        System.out.println("Enter The First Number: ");
        double calculator1 = calc.nextDouble();
        //nextDouble() is a method of Java Scanner class which is used to scan the next token of the input as a double.

        System.out.println("Enter The Second Number: ");
        double calculator2 = calc.nextDouble();
        //nextDouble() is a method of Java Scanner class which is used to scan the next token of the input as a double.

        System.out.println("Enter The Operator(+,-,*,/,%): ");
        char operator = calc.next().charAt(0);
        //next() method finds and returns the next complete token from this scanner.
        //charAt(0) This returns the first character in our string.

        double result = 0.0;

        switch (operator) {
            case '+':
                result = calculator1 + calculator2;
                break;
            case '-':
                result = calculator1 - calculator2;
                break;
            case '*':
                result = calculator1 * calculator2;
                break;
            case '/':
                result = calculator1 / calculator2;
                break;
            case '%':
                result = calculator1 % calculator2;
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }

        System.out.println(calculator1+" "+operator+" "+calculator2+"="+result);

        calc.close();

    }
}
