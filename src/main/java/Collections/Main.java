package Collections;

import java.util.*;

public class Main {
    static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<>();
//        LinkedList<String> cars = new LinkedList<>();
//        HashSet<String> cars = new HashSet<String>();
//        TreeSet<String> cars = new TreeSet<>();
        LinkedHashSet<String> cars = new LinkedHashSet<>();
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("Audi");
        cars.add("BMW");

//        System.out.println(cars.get(0));
//        cars.set(0, "Honda");
//        System.out.println(cars.remove(0));
//        System.out.println(cars);

//        for (String car : cars) {
//            System.out.println(car);
//        }

        System.out.println(cars);
    }
}
