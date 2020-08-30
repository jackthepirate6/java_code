import java.util.*;
import java.lang.*;
import java.io.*;

class Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}

class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        
        Animal.testClassMethod();
        
        myCat.testClassMethod();
        myCat.testInstanceMethod();
        myAnimal.testClassMethod();
        myAnimal.testInstanceMethod();
        
        Animal animal = new Animal();
        animal.testClassMethod();
        animal.testInstanceMethod();
    }
}

The output of the following code is:

The static method in Animal
The static method in Cat
The instance method in Cat
The static method in Animal
The instance method in Cat
The static method in Animal
The instance method in Animal

