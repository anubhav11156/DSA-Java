package LeetCode;

import java.util.Scanner;

public class LemonadeChange {

    public static boolean lemonadeChange(int[] bills) {
        int balance = 0;
        boolean answer = false;
        if (bills[0] == 10 || bills[0] == 20) {
            return answer;
        } else {
           
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n;
        n = console.nextInt();for(int i=0; i<bills.length; i++){
            
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = console.nextInt();
        }
        System.out.println("Answer: \n" + lemonadeChange(arr));
        console.close();
    }
}
