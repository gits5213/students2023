package com.abzaman.testJava;

public class Array {
    
    String a = "I am learning";

    static String[] cars = {"volvo", "BMW", "mazda"};

    static int[] number = {1,2,3,4,5,6};

    
    public static void main(String[] args) {
        
        System.out.println(cars[0]);
        System.out.println(number[0]);

        for(int i = 0 ; i <= 2; i++){
    
            System.out.println(cars[i]);
            
        };
        
    }
}
