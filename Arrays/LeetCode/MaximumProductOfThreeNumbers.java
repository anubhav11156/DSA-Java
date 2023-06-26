package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumProductOfThreeNumbers {

    public static int maximumProduct(int[] nums) {
        int product = 1;
        // sort the array in descending order and find product of first three numbers
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(Math.abs(nums[i])<Math.abs(nums[j])){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.print("sorted: "+Arrays.toString(nums));

        for(int i =0; i<3; i++){
            product *= nums[i];
        }
        return product;
    }

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int s;
        s = console.nextInt();
        int[] arr = new int[s];
        for(int i=0; i<s; i++){
            arr[i] = console.nextInt();
        }
        System.out.println("Answer: "+maximumProduct(arr));
        console.close();
    }
}
