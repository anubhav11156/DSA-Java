
import java.util.*;

// Given an array, write a function to get first, second best scores from the array and return it in new array.
// do in O(n) T.C

public class bestScore {

    public static int[] firstSecond(int[] arr){
        int[] temp = new int[2];
        // logic here
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int secondMax = arr[0];
        for(int i=0; i<arr.length; i++){
            if((arr[i]>secondMax)&&(arr[i]<max)){
                secondMax = arr[i];
            }
        }
        temp[0] = max;
        temp[1] = secondMax;
        return temp;
    }

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = console.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter elements : ");
        for(int i=0; i<size; i++){
            arr[i] = console.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Max and second max are: "+ (Arrays.toString(firstSecond(arr))));
        console.close();
    }
}
