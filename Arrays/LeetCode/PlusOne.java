package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {

    public static long[] plusOne(int[] digits) {

        long number = 0;
    
        for (int digit : digits) {
            number = number * 10 + digit;
        }


        System.out.println("befor number: "+number);

        number +=1;

        System.out.println("after Number is: "+number);

        String str = Long.toString(number);
        int length = str.length();
        System.out.print("Length: "+length);
        int i = length-1;
        long[] arr = new long[length];
        while(i>=0){
            long lastDigit = number % 10;
            arr[i] = lastDigit;
            number /= 10;
            i--;
        }

        return arr;
    }

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int size;
        System.out.println("Enter size: ");
        size = console.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array elements: ");
        for(int i=0; i<size; i++){
            arr[i] = console.nextInt();
        }
        System.out.println("\nFinal: "+Arrays.toString(plusOne(arr)));
        console.close();
    }
}
