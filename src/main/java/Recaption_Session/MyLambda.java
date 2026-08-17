package Recaption_Session;

interface Calculator{
//    int addition(int x, int y);
    void display();
}

public class MyLambda{
    static void main(String[] args) {
//        Recaption_Session.Calculator c = (x, y) -> x + y;
//
//        System.out.println(c.addition(7, 20));

        Calculator c = () -> {
            System.out.println("Hello World");
        };

        c.display();

    }
}
