package MyWrapperClass;
import java.lang.Integer;

public class Main {
    static void main(String[] args) {
//        int ---> Integer

        int a = 108887878;

        Integer obj = new Integer(a); // Autoboxing

        int b = obj.intValue();       // unboxing

        System.out.println(b);
    }
}
