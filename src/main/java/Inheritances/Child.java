package Inheritances;

public class Child extends Parent {
    static void main(String[] args) {
        Child s1 = new Child();

        System.out.println(s1.brandedWatch);
        System.out.println(s1.isCar);
        s1.bankBalance();
        System.out.println("Grandparent Assets Values: " + s1.AssetsValue);
    }
}
