package com.sqajava.javapracties;

public class DataTypes {
    /*
    - Primitive data:
                    boolean, char, byte, short, int, long, float and double
    - non - primitive data:
                    Classes, Interfaces, and Arrays

    - KISS & DRY

     */
    boolean check = true;

    public static void main(String[] args) {

        System.out.println("");

        char word = 'A';
        String name = "alexiamitsaha";
        System.out.println( word +"-"+name );

        int variableNumber = 1;
        if(variableNumber == 1){
            System.out.println("This statement is true");
        }else {
            System.out.println("This statement is False");
        }

        int num = 10;
        float Floatnum = 522222.33f;
        //pre-fix //suffix
        char Letter = 'a';
        boolean bool = false;
        String text = "I am learning Java";
        double Double = 123456.5;

    }
}
