package com.pranrfl.getwell.Inheritance;

public class ClassB extends ClassA{

    String qualification;

    void display2(){
        display1();
        System.out.println("Qualification: "+qualification);
    }

}
