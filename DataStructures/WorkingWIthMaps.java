package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class WorkingWIthMaps {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hannah");
        map.put(2, "Jamil");
        map.put(3, "Alice");

        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.keySet());

        System.out.println();

        for (int key : map.keySet()) {
            System.out.println(map.get(key));
        }

        System.out.println();

        map.forEach((k, v) -> {
            System.out.println(k + " - " + v);
        });

        System.out.println();

       String defaultV = map.getOrDefault(5, "this is default value");
        System.out.println(defaultV);
    }
}
