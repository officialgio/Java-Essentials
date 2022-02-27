package DataStructures;

import java.util.HashSet;
import java.util.Iterator;

public class WorkingWithSets {
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();

        set.add('A');
        set.add('B');
        set.add('C');
        set.add('D');


//        for (char character: set) {
//            System.out.println(character);
//        }

        Iterator<Character> iterator = set.iterator();
        while (iterator.hasNext()) {
            Character character = iterator.next();
            System.out.println(character);
        }


    }
}
