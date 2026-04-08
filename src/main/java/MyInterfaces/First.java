package MyInterfaces;

interface First {
    void firstMethod();
}

interface Second {
    void secondMethod();
}

class Sample implements First, Second {
    @Override
    public void firstMethod() {
        System.out.println("First Method");
    }
    @Override
    public void secondMethod() {
        System.out.println("Second Method");
    }
}

class Main {
    public static void main(String[] args) {
        Sample obj = new Sample();
        obj.firstMethod();
        obj.secondMethod();
    }
}