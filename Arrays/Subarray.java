import java.util.Scanner;

public class Subarray {

    public static void printSubarray(int[] arr){
        int n = arr.length;

        for(int start=0; start<n; start++){
            for(int end = start; end<n; end++){
                for(int i=start; i<=end; i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }

     public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n;
        n = console.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = console.nextInt();
        }
        System.out.println("Subarray: \n");
        printSubarray(arr);
        console.close();
    }
}

