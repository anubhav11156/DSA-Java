package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class ContainsDuplicateI {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n;
        n = console.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = console.nextInt();
        }
        System.out.println("Answer: " + containsDuplicate(arr));
        console.close();
    }
}
