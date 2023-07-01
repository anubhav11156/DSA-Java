package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SummaryRanges {

    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> myArray = new ArrayList<String>();
        int i = 0;
        while (i < nums.length) {
            int current = nums[i];
            int initial = nums[i];
            boolean orderFound = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (current + 1 == nums[j]) {
                    current = nums[j];
                    orderFound = true;
                    i = j;
                }
            }
            if (!orderFound) {
                String strNumber = Integer.toString(nums[i]);
                myArray.add(strNumber);
            } else {
                String str1 = Integer.toString(initial);
                String str2 = Integer.toString(current);
                String toAdd = str1 + "->" + str2;
                myArray.add(toAdd);
            }
            i++;
        }
        return myArray;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int s;
        s = console.nextInt();
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = console.nextInt();
        }
        System.out.println("Answer: " + summaryRanges(arr));
        console.close();
    }
}
