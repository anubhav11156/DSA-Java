package LeetCode;

import java.util.Scanner;

public class ContainsDuplicate2 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        
        return false;
    }

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n;
        n = console.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = console.nextInt();
        }
        int k;
        k = console.nextInt();
        System.out.println("Answer: "+containsNearbyDuplicate(arr,k));
        console.close();
    }
}
