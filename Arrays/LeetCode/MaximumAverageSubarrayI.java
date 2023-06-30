package LeetCode;

import java.util.Scanner;

public class MaximumAverageSubarrayI {
    public static double findMaxAverage(int[] nums, int k) {
       double sum = 0;
       for(int i=0; i<k; i++){
        sum += nums[i];
       }

       double answer = sum;

       for(int i=k; i<nums.length; i++){
        sum += nums[i] - nums[i-k];
        answer = Math.max(answer, sum);
       }

       return answer/k;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size;
        size = console.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = console.nextInt();
        }
        int k;
        k = console.nextInt();
        System.out.println("Answer: " + findMaxAverage(arr, k));
        console.close();
    }
}
