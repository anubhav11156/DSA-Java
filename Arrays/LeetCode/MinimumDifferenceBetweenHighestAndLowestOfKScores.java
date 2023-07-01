package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumDifferenceBetweenHighestAndLowestOfKScores {

    public static int minimumDifference(int[] nums, int k) {
        if (nums.length == 1 || (nums.length == 1 && nums[0] == 0)) {
            return 0;
        }
        Arrays.sort(nums);
        int minimum = Math.abs(nums[k-1] - nums[0]);

        for (int i = k; i < nums.length; i++) {
            int min = Math.abs(nums[i]-nums[i-k+1]);
            minimum = Math.min(minimum, min);
        }
        return minimum;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n;
        n = console.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = console.nextInt();
        }
        int k;
        k = console.nextInt();
        System.out.println("Answer: " + minimumDifference(arr, k));
        console.close();
    }
}
