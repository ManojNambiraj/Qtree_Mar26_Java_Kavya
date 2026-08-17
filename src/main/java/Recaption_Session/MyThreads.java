package Recaption_Session;

class Demo extends Thread{
    public void run(){
        try{
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println("Thread1: " + i);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

class Demo2 extends Thread{
    public void run(){
        try{
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println("Thread2: " + i);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

public class MyThreads {
    static void main(String[] args) {
        Demo d1 = new Demo();
        Demo2 d2 = new Demo2();

        d1.start();
        d2.start();

    }
}
