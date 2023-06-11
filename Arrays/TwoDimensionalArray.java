
import java.util.Arrays;

public class TwoDimensionalArray {
    int arr[][] = null;

    public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];
    }
    public static void main(String[] args){
        // Step 1: Declare
        int[][] int2DArray;
        // Step 2: Instantiate
        int2DArray = new int[2][2];
        // Step 3: Initialize
        int2DArray[0][0] = 1; // these take O(mn) time complexity
        int2DArray[0][1] = 2; // space complexity = O(mn)
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;

        // now print the array;
        System.out.println(Arrays.deepToString(int2DArray));

        String String2DArray[][] = {{"a","b"},{"c","d"}}; //TC: O(1)
        System.out.println(Arrays.deepToString(String2DArray)); 
    }
}
