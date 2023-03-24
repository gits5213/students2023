package com.sqajava.javapracties.controlStatement;

public class Loop {
    /*
    Loop:
        when you know how many times you want to loop through a block of code, use for loop
        instead of a while loop

        for (type statement 1; statement 2; statement 3){
            //code block to be executed
        }
         */
    public static void main(String[] args) {
        //Nested Loops:

        //Outer Loops:
        int i;
        int j;
        for (i=0;i<=10;i++){
            System.out.println("Print Outer Loop" + i);
            for(j=0;j<=9;j++){
                System.out.println("print inner Loop" + j);
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
        for (String total: car) {
            System.out.println(total);
        }
                /*
                //While
                while (condition){
                //code block to be executed
                }
                 */
        while (i<5){
            System.out.println(i);
            i++;
        }

    }

}
