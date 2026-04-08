package org.example;

public class Cons {
    static void main(String[] args) {
        Cars honda = new Cars();

        honda.setNo_wheels(5);
        System.out.println(honda.getNo_wheels());

        honda.setNo_sheets(6);
        System.out.println(honda.getNo_sheets());

        honda.setColor("Red");
        System.out.println(honda.getColor());
    }
}
