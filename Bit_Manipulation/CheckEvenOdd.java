package Bit_Manipulation;

import java.util.Scanner;

public class CheckEvenOdd {

    public static boolean checkOdd(int n){
        return (n & 1)==1;  // (n&1) = 1 if number is odd 
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n;
        n = console.nextInt();
        System.out.println(checkOdd(n));
        console.close();
    }
}
