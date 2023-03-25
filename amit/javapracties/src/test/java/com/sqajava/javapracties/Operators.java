package com.sqajava.javapracties;

public class Operators {
    /*
    Operators are used to perform operations on variable and values.
    int a = 10;
    - Arithmetic()
            - addition +
            - subtraction -
            - multiplication x
            - Division /
            - modulus %
            - increment ++
            - decrement --
    - Assignment
            =, +=, -=, *=, /=,%=, &=, |=, >>=, <<=
    - Comparison
            ==, !=, >,<, >=, <=
    - logical
            &&, ||, !
    - Bitwise
     */

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int total = num1+num2;
        System.out.println("Sum of the two number: " + total);

        System.out.println(num1 < num2); // true or false check
        System.out.println(num1 > num2); // true or false check

    }
}
