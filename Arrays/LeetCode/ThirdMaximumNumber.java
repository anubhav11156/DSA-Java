package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ThirdMaximumNumber {

    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> arr = removeDuplicates(nums);
        if(arr.size()<3){
            return arr.get(arr.size()-1);
        }else{
            return arr.get(arr.size()-3);
        }
    }

    public static ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(arr[0]);
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                if(myArray.contains(arr[j])){
                    continue;
                }else{
                    myArray.add(arr[j]);
                }
            }
        }
        return myArray;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n;
        n = console.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = console.nextInt();
        }
        System.out.println("Answer: " + thirdMax(arr));
        console.close();
    }
}
