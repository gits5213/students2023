package com.sqajava.javapracties;

public class Variable {
    /*
        A variable is a container which holds the value while the
        java program is executed

        Variable is a name of memory location. there are three types of variable in java
        1. Local
        2. Instance
        3. Static
        A variable is the name of a reserved area allocated in memory.

        Method - return type, name, parentheses(), open curly brace and closing curly brace


        int num1 = 10; //called instance variable
        static Num2 = 20; //called Static variable


        //called local variable
        void method(){
        int num3 = 30;
        }
         */

    public static void main(String[] args) {

        // print sum all the variable
        int number1 = 10;
        int number2 = 20;
        int totalNumber= number1 + number2;
        System.out.println("print total number:" + totalNumber);
    }
}
