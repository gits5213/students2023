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
        int c = 30;

        System.out.println("Total = " + (a+b));

        System.out.println("True or false= "+ (a==b));

        System.out.println("True or false= "+ (a!=b));

        System.out.println("True or false= "+ (a>b));

        System.out.println("True or false= "+ (a<b));

        System.out.println("True or false= "+ (a>5 && a<15));

        System.out.println("True or false= "+ (a>5 || a<15));

        System.out.println("True or false= "+ (!(a>5 || a<15)));

//        System.out.println(a<b && a++<c);//true && true = true
//        System.out.println(a);//11 because both condition is checked
//
//        System.out.println(b<a && a++<c);//false && true = false
//        System.out.println(a);//10 because second condition is not checked
//
//        System.out.println(a>b && a++>c);//true && false = false
//        System.out.println(a);//10 because second condition is not checked

        System.out.println(a<b || a++<c);//true && true = true
        System.out.println(a);//11 because both condition is checked

        System.out.println(b<a || a++<c);//false && true = true
        System.out.println(a);//11 because second condition is  checked
//
        System.out.println(a>b || a++>c);//false && false = false
        System.out.println(a);//11 because second condition is checked

        System.out.println(5 % 6);//false && false = false


    }
}
