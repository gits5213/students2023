package com.gits.sheba.java.controlStatement;

public class Loop {
    public static void main(String[] args) {

        /*
        when you know how many times you want to loop through a block of code, use for loop
        instead of a while loop

        for (type statement 1; statement 2; statement 3){
            //code block to be executed
        }
         */

        //Nested Loops

        //Outer loop
        for (int i=0; i<=10; i++){
            System.out.println("====Outer Loop" + i);

            for(int j=5; j<=9; j++){
                System.out.println("Inner Loo" + j);
            }
        }

        //For-Each Loop
        /*
        String[] cars = {"Volvo", "BMW", "GMC"}
        for (type variableName: arrayName){
        //code block to be executed
        }
         */

        String[] car = {"Volvo", "BMW", "GMC"};
        for (String i: car) {
            System.out.println(i);
        }
        /*
        //While
        while (condition){
        //code block to be executed
        }
         */
        int i = 0;
        while (i<5){
            System.out.println(i);
            i++;
        }


    }
}
