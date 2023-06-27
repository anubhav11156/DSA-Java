package LeetCode;

import java.util.Scanner;

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int tempCount = Integer.MIN_VALUE;
        int count = 0;
        for(int num : nums){
            if((num&1)==num){
                count++;
                if(count>tempCount){
                    tempCount = count;
                }
            }else{
                count = 0;
                continue;
            }
        }
        return tempCount;
    }

     public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n;
        n = console.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = console.nextInt();
        }
        System.out.println("Answer: \n"+findMaxConsecutiveOnes(arr));
        console.close();
    }
}
