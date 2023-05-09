package com.gits.devsden.Polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myBirds = new Birds();
        Animal myDog = new Dog();
        Animal myPig = new Pig();
        Animal myCat = new Cat();

        myAnimal.animalSound();
        myBirds.animalSound();
        myDog.animalSound();
        myPig.animalSound();
        myCat.animalSound();
    }
    }

