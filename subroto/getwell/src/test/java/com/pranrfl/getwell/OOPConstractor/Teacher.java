package com.pranrfl.getwell.OOPConstractor;

public class Teacher {

    String name,gender;
    int age,phone;

    Teacher(){
        System.out.println("nothing to show");
        System.out.println("\n");
    }

    Teacher(String n,String g){

        String name = n;
        String gender=g;
        System.out.println("\n");
    }


    Teacher(int a,int p){
        int age= a;
        int phone= p;
        System.out.println("\n");
    }
    void DisplayInformation(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Phone: "+phone);
    }


}
