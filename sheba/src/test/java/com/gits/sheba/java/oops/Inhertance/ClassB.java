package com.gits.sheba.java.oops.Inhertance;


import com.gits.sheba.java.oops.Encapsulation;

public class ClassB extends ClassA{

    String color = "black";

    void printColor(){
        System.out.println("Class B Color: " + color);
        System.out.println("Class A Color: " + super.color);
    }





    public static void main(String[] args) {

        ClassB cb = new ClassB();
        cb.display();
        cb.printColor();

        ClassC cc = new ClassC();
        cc.sum();


    }


}
