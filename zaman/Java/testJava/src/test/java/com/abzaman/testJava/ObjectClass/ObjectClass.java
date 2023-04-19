package com.abzaman.testJava.ObjectClass;

public class ObjectClass {

    /*
     * A class is a group of objects wich have common propertertis it is a template
     * or blue print from which object are created. It is a logical entity.
     * it cant be phycical.
     * 
     * A class in java can contain:
     * 
     * - Fields
     * - methods
     * - constructors
     * - blocks
     * - nested class and interfaces.
     * 
     * A java class can be defined as a blue print which describs state or behiviour
     * of its object.
     * 
     * A class is used to creat a object
     * 
     * Obejects are the instanc eof a class
     * 
     * in java an object is created when someone says "new"
     * objects lives in java heap
     * java heap are maemory space for jvm taken from the os
     * al objects are created in the heap space.
     * when ever jvm encounters "new" keyward, it creats and object in the heap
     * 
     * when there is no space in heap to creat object, then JVM throughs
     * "out of memoey" error
     * 
     * Grabaje collection is a mechanism proivided by JVM
     * 
     * 
     */

    public static void main(String[] args) {

        // new tree();
        // new zz();
        for (int i = 0;; i++) {
            
            ObjectClass object = new ObjectClass();
        
            System.out.println(i);
        }

    }
}
