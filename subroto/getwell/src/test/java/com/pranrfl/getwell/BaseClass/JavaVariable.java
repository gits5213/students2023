package com.pranrfl.getwell.BaseClass;

public class JavaVariable {

       /* In Java, there are different types of variables, for example:

        String - stores text, such as "Hello". String values are surrounded by double quotes
        int - stores integers (whole numbers), without decimals, such as 123 or -123
        float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
        boolean - stores values with two states: true or false

        Datatype variableName = value;

        Variable is NonPrimitive Data Type
        */

         /*
        A variable is a container which holds the value while the
        java program is executed

        Variable is a name of memory location. there are three types of variable in java
        1. Local
        2. Instance
        3. Static
        A variable is the name of a reserved area allocated in memory.
         */
        //Method - //return type, name, parentheses(), open curly brace and closing curly brace
        static int m = 2; // Static
        int number_1 = 2; //Instance

        // var, let, const
        // const a = 2;
        // a = "abec"

        void method(){
            //let a = 2;
            int number = 2; //Local variable (let)
        }
        public static void main(String[] args) {
            int firstNumber = 10;
            int secondNumber = 15;
            int totalNumber = firstNumber + secondNumber;
            System.out.println(totalNumber);
        }

    }

