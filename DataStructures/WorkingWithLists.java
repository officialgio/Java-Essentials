package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(30);
        list.add(22);

        list.remove(1);
        list.add(2, 44);
        System.out.println(list.contains(30));

        System.out.println(list);

//        System.out.println();

//        for (Object i: list) {
//            System.out.println(i);
//        }
//        System.out.println();
//
//        list.forEach(System.out::println);

    }
}
