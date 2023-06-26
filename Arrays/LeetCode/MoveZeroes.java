package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if( (nums[i]==0)&&(nums[j]!=0)){
                    //swap
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = console.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        moveZeroes(arr);
        System.out.println("After moving: "+Arrays.toString(arr));
        console.close();
    }
}
