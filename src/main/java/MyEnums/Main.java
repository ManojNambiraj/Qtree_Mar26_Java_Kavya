package MyEnums;

public class Main {

    enum Color {
        RED, GREEN, BLUE
    }

    static void main(String[] args) {
        Color color = Color.RED;

        switch (color) {
            case RED:
                System.out.println("Low level color");
                break;
            case GREEN:
                System.out.println("High level color");
                break;
            case BLUE:
                System.out.println("Default color");
                break;
        }
    }
}
