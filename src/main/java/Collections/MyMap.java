package Collections;

import java.util.HashMap;

public class MyMap {
    static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("BMW", 1);
        map.put("Ford", 2);
        map.put("Toyota", 3);

//        System.out.println(map.get("BMW"));
//        System.out.println(map.remove("Ford"));
        System.out.println(map);

        for (int key : map.values()) {
            System.out.println(key);
        }

    }
}
