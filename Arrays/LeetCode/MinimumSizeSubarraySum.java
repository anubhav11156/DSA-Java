package LeetCode;

import java.util.Scanner;

public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {
        int minimumLength = nums.length+1;
        int currentSum = 0;
        int start=0;
        for (int end = 0; end < nums.length; end++) {
            currentSum += nums[end];
            while(currentSum>=target){
                minimumLength = Math.min(minimumLength, end - start + 1);
                currentSum -=nums[start];
                start++;
            }
        }

        return (minimumLength>nums.length) ? 0 : minimumLength;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n;
        n = console.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = console.nextInt();
        }
        int k;
        k = console.nextInt();
        System.out.println("Answer: " + minSubArrayLen(k, arr));
        console.close();
    }
}
