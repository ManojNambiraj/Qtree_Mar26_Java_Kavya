package Recaption_Session;

import MyAbstract.Student;

class Animal {
    String name;

    Animal(String name){
        this.name = name;
    }
}

public class MyGC {
    static void main(String[] args) {
        Animal dog = new Animal("Puppy");
        Animal cat = new Animal("Cat");

        System.out.println(dog.name);
        System.out.println(cat.name);

        System.out.println("----------------------------");

        dog = null;
        cat = null;

        System.gc();

        System.out.println("Object is not found");

    }
}
