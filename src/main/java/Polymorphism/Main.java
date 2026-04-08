package Polymorphism;

class Animal{
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    public void sound(){
        super.sound();
        System.out.println("Pig makes a sound: Bow Bow");
    }
}

public class Main {
    static void main(String[] args) {
//        Animal animal = new Animal();
        Dog d = new Dog();
        d.sound();
    }
}
