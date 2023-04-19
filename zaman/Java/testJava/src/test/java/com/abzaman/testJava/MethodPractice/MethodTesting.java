package com.abzaman.testJava.MethodPractice;

import java.util.Scanner;

import com.abzaman.testJava.MethodPractice.CustomMethod;

public class MethodTesting extends CustomMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a = 3;
        double b = 3;

        while (true) {

            int num1 = CustomMethod.firstNumberInput(input);
            System.out.println("You entered: " + num1);

            int num2 = CustomMethod.secondNumberInput(input);
            System.out.println("You entered: " + num2);

            String num3 = CustomMethod.add(num1, num2);

            System.out.println("Result:" + num3);
            System.out.println();
            System.out.println();
            System.out.println();

        }

    }

}
