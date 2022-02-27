package DataStructures;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,45};
        System.out.println(Arrays.toString(numbers));

        for (int i : numbers) {
            System.out.println(i);
        }

        for (int i = 0 ; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
