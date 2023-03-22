package com.gits.sheba.java;

public class Variable {
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
        int first_number = 10;
        int second_number = 15;
        int total_number = first_number + second_number;
        System.out.println(total_number);
    }
}
