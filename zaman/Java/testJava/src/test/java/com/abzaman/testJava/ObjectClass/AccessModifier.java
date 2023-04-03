package com.abzaman.testJava.ObjectClass;

public class AccessModifier {



    /*access modifier       withinClass          withinPackage       outsidePackage
     * private                  y                    n                     n
     * default                  y                    y                     n
     * protected                y                    y                     y             
     * public                   y                    y                     n
     * 
     * 
     * 
     * static keyword for memory management. to precisely allocate memory.
     * dynamic keyword is used for dynamic memory management.
     * this keyword is used to refer to the current object within a class.
     * constructor is a block of code similar to the method. it is call when an instance of the class is created.
     */

     static int k = 6;

     //method of sum
     int sum(int a, int b){

        return a+b;
     }

     //constructor (doesn't have a return type and cant be assigned with public and private or variable)
     //2 types of constructor, by default and parameterized constructor. 
     AccessModifier(int id, String name){

        System.out.println("constructor is created");
        this.id = id;
        this.name = name;
        
        void display(){
            System.out.println(id + name);
            
        }
        

    public static void main(String[] args) {
        
        //this.k = k;

        //to create a default constructor
        AccessModifier AM = new AccessModifier(2,);


    }
    
}
