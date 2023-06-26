package LeetCode;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int count = 0;
        
        int[] arr = new int[heights.length];
        
        for(int i=0; i<heights.length; i++){
            arr[i] = heights[i];
        }

        for(int i=0; i<heights.length; i++){
            for(int j=i+1; j<heights.length; j++){
                if(heights[i]>heights[j]){
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;
                }
            }
        }

        System.out.print("Sorted: "+ Arrays.toString(heights));

        for(int i=0; i<arr.length; i++){
            if(arr[i]!=heights[i]){
                count++;
            }
        }

        return count;
    }
}
