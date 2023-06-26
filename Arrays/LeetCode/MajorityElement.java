package LeetCode;

import java.util.Scanner;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int majorityElement = nums[0];

        int[] counted = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int currentFrequency = 0;
            for (int j = 0; j < nums.length; j++) {
                if (counted[i] == 0) {
                    if (nums[i] == nums[j]) {
                        currentFrequency++;
                    }
                }
            }
            counted[i]=1;
        }
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
