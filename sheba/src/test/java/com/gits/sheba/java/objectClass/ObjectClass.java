package com.gits.sheba.java.objectClass;

public class ObjectClass {
    /*
    A class is a group of objects which have common properties. It is a template or
    blueprint from which objects are created. It is a logically entity. It can't be physical.
    A Class Inheritance Java can contain:
    - Fields
    - Methods
    - Constructors
    - Blocks
    - Nested class and interfaces

    A Java class can be defined as a template or blueprint which describes state/behavior
    of it's object.

    A Class is used to create a objects.
    Object are nothing however, the instance of the class
    In java an object is created when someone says "new"

    - Objects lives Inheritance Java heap
    - Java heap is nothing but the memory space taken by JVM from OS.
    - All object are created Inheritance the heap space. Whenever JVM encounters
    "new" keyword, it creates an object Inheritance the heap.

    - When there is no space Inheritance heap to create objects, then JVM throws "out of Memory" error
     */

    public final static int A_B = 5;

    public static void main(String[] args) {

        ObjectClass oc = new ObjectClass();
        for (int i=0; ; i++){
            System.out.println(i);
        }
    }

    /*
    class MyClass :
    def __init__(self, name, age):
        self.name = name
        self.age = age

    p1 = MyClass("Talha", 26)
    print(p1.name)
     */

    /*
    Class:
    - It should start with the uppercase and following camel case
    - It should be a noun, appropriate word, meaningful name
    Interface:
    - It should start with the uppercase and following camel case
    - It should an adjective
    - appropriate word, meaningful name
    Method:
    - It should start with lowercase and following camel case
    - It should be a verb
    - appropriate word, meaningful name
    Variable:
    - It should start with lowercase and following camel case
    - Meaningful name
    Package:
    - It should start with lowercase and following .
    constant:
    - it should be all uppercase letter, following _
     */
}
