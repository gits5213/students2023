package com.sqajava.javapracties.controlStatement;

public class ifElse {

    /*
    //Control Statement:

        Use if: to specify a block of code to be executed, if a specified condition is true
        Use else: to specify a block of code to be executed, if the same condition is false
        Use else if: to specify a new condition to test, if the first condition is false

        java - Intillij / Eclipse
        C# - Visual Studio
        javascript - VS Code
        python - pyCherm

     */
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        if(num1 == num2){
            System.out.println("conditional is undefined");
        }else if (num1 < num2){
            System.out.println("conditional is true");
        }else {
            System.out.println("condition is false");
        }
    }
}
