package com.abzaman.testJava;

public class DataTypes {

    /*
    -primitive datatype (defined by pl)
    boolean, char, byte, short, long, float and double.

    -no primitive data types (defined by user)
    classes, interfaces, and arrays.

    KISS and DRY keep it stupid simple and don't repeat again.

    int is an integer data type

    char



     */

    public static void main(String[] args) {

        char a = 'A';
        String b= "abzaman";
        float c = 5.66f;
        double d = 55.33;



        System.out.println(a + b);
        System.out.println(a + "    "+ b);

        int numberOne = 1;

        if( numberOne == 1){

            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }




}
