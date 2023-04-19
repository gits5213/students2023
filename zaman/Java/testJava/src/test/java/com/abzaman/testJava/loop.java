package com.abzaman.testJava;

public class loop {

    /*
    for ()
    when you know how many times you want to loop through a block. use for loop

    for (statement1; statement 2; statement3;){
        code block to be executed

        for eich loop only for array

        string[] cars = {"volvo", "BMD","GMC",}
        for (type  VariableName: arrayName){
        code block to be executed
        }

    }

    for js
    for(let k = 0; k<=10; k++){
    console.log(k)
    }
     */

    public static void main(String[] args) {

        for (int i= 0; i<6; i++){

            System.out.println(" Outer loop ===== " +i);

            for (int j= 1; j<10; j++ ){

                System.out.println("Inner loop = " +j);
            }
        }

        String[] car = {"car","bmw","GMC"};

        for (String k: car){

            System.out.println(k);
        }

        int k = 0;

        while (k<5){
            System.out.println(k);
            k++;
        }
    }





}
