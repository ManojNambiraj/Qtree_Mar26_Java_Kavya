package org.example;

public class Recursion {
    static int mydemo(int a){
        if(a > 0){
            return a + mydemo(a - 1);
        } else {
            return 0;
        }
    }

    static void main() {
        System.out.println(mydemo(5));
    }
}
