package LeetCode;

import java.util.Scanner;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        
    }

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int s;
        s = console.nextInt();
        int[] arr = new int[s];
        for(int i=0; i<s; i++){
            arr[i] = console.nextInt();
        }
        System.out.println("Answer: "+majorityElement(arr));
        console.close();
    }
}
