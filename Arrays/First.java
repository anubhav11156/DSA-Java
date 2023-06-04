// Arrays

import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        int[] array; // declare
        array = new int[3]; // with value of 0
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;

        System.out.println(Arrays.toString(array));

        String sArray[] = {"a","b","c"};
        System.out.println(Arrays.toString(sArray));
    }   
}
