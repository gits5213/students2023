package com.gits.sheba.java.objectClass;

import com.gits.sheba.java.Variable;

public class AccessModifier {

    int id;
    String name;
    void display(){
        System.out.println(id + " " + name);
    }

    AccessModifier(int id, String name){
        System.out.println("AccessModifier is created");
        this.id = id;
        this.name = name;
    }


    public int number = 3;

    /*
    Access Modifier  withinClass  withinPackage outsidePackage
    Private          Y            N              N
    Default           Y           Y              N
    Protected        Y             Y             N
    Public          Y            Y             Y

    //Static keyword

    - Variable
    - Method

    //this



     */

     static int k = 3;

     int sum (int a, int b){
         return 2+3;
     }
     /*
     Constructor is a block of codes similar to the method. it called when an instance
     of the class is created.
      */


    public static void main(String[] args) {
        AccessModifier am1 = new AccessModifier(35, "MD");
        am1.display();



    }








}
