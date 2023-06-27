package LeetCode;

import java.util.Scanner;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
      int answer = nums[0];

      for(int num : nums){
        if(frequency(nums, num)>nums.length/2){
            answer = num;
        }
      }
      return answer;
    }

    public static int frequency(int[] arr, int n){
        int count = 0;
        for( int num : arr ){
            if(num==n){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int s;
        s = console.nextInt();
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = console.nextInt();
        }
        System.out.println("Answer: " + majorityElement(arr));
        console.close();
    }
}
