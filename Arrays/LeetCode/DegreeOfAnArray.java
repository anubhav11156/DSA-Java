package LeetCode;

import java.util.Scanner;

public class DegreeOfAnArray {

    public static int findShortestSubArray(int[] nums) {
        int degreeOfGivenArray = degreeOfArray(nums);
        int answer = nums.length;
        for(int start=0; start<nums.length; start++){
            for(int end=start; end<nums.length; end++){
                int currentLength = (end - start)+1;
                int[] subArray = new int[currentLength];
                for(int i=start, j=0; i<=end; i++, j++){
                    subArray[j] = nums[i];
                }
                int subArrayDegree = degreeOfArray(subArray);
                if(degreeOfGivenArray==subArrayDegree){
                    answer = Math.min(answer, subArray.length);
                }
            }
        }

        return answer;
    }

    public static int degreeOfArray(int[] arr){
        int degree = 1; // maximum frequency of any of its element
        for(int num : arr){
            if(frequency(arr, num)>degree){
                degree = frequency(arr, num);
            }
        }
        return degree;
    }

    public static int frequency(int[] arr, int n){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==n){
                count++;
            }
        }
        return count;
    }

     public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n;
        n = console.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = console.nextInt();
        }
        System.out.println("Answer: "+findShortestSubArray(arr));
        console.close();
    }
}
