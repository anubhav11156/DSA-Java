package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAllNumbersDisappearedInArray {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        // step:1 => marking
        for(int i=0; i<nums.length; i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index] = -nums[index];
            }
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                arr.add(i+1);
            }
        }
        return arr;
    }

     public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n;
        n = console.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = console.nextInt();
        }
        System.out.println("Answer: " + findDisappearedNumbers(arr));
        console.close();
    }
}
