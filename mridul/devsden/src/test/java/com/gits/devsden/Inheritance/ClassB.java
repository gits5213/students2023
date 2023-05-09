package com.gits.devsden.Inheritance;

public class ClassB extends ClassA{
    // name,age,displayInformation1()

    String qualification;
    void displayInformation2() {
        displayInformation1();
        System.out.println("Qualification: "+qualification);
    }
}
