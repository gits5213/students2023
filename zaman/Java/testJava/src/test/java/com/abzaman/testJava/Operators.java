package com.abzaman.testJava;

public class Operators {

    /* for java
    Operators are used to perform operations on variable and values.

    int a = 10; ( assignment operator )

    - Arithmetic ( addition +, subtraction -, division /, module %, increment ++, decrement -- )
    - Assignment ( =, +=, -=, *=, %=, &=, |=, >>=. <<= )
    - Comparison ( ==, !=, >, <, >=, <=, )
    - logical ( &&, ||, ! )
    - Bitwise ()
     */

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Total = " + (a+b));

        System.out.println("True or false= "+ (a==b));

        System.out.println("True or false= "+ (a!=b));

        System.out.println("True or false= "+ (a>b));

        System.out.println("True or false= "+ (a<b));

        System.out.println("True or false= "+ (a>5 && a<15));

        System.out.println("True or false= "+ (a>5 || a<15));

        System.out.println("True or false= "+ (!(a>5 || a<15)));


    }
}
