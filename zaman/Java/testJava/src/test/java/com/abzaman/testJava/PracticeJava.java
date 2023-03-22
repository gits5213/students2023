package com.abzaman.testJava;
public class PracticeJava {

    //instance variable

    int number1 = 22;

    //static variable

    static int number3 = 3;

    public static void main(String[] args) {



        System.out.println("Hello world");

        /*a variable is a container which holds a value

        variable is a name of location
        1. local
        2. instance
        3. Static

        */

        //Local variable

        // var a = 2; in JS
        // var, let, const in JS

        // in python we write a = 111;
        int a = 5;
        int number = 25;
        int total_number = a + number;

        System.out.println("total number = " + total_number);

        //print only variable
        System.out.println(a);

        // Add variable direct in print
        System.out.println(a + number);

        // Print multiple text and number in a single line
        System.out.println("total number1 = "+number+"total number 2 = "+number+"total number 3 = "+total_number);




    }

}
