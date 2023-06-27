package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPartition {

    public static int arrayPairSum(int[] nums) {
        int maxSum = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i+=2){
            maxSum+=nums[i];
        }
        return maxSum;
    }

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n;
        n = console.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = console.nextInt();
        }
        System.out.println("Answer: "+arrayPairSum(arr));
        console.close();
    }
}
