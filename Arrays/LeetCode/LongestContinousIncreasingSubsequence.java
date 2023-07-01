package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class LongestContinousIncreasingSubsequence {

    public static int findLengthOfLCIS(int[] nums) {
        int maxLength = 1;
        int start = 0;
        int end=0;
        
        return 1;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n;
        n = console.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = console.nextInt();
        }
        System.out.println("Answer: " + findLengthOfLCIS(arr));
        console.close();
    }
}
