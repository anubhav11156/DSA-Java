
import java.util.*;

// Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)
// T.C : O(n^2)
public class duplicateNumbers {

    public static ArrayList<Integer> removeDuplicates(int[] arr){
        ArrayList<Integer> newArray = new ArrayList<>();
        // logic
        for(int i=0; i<arr.length; i++){
            boolean isDuplicate = false;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    // duplicate found
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                newArray.add(arr[i]);
            }
        }
        return newArray;
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
        ArrayList<Integer> newArray = removeDuplicates(arr);
        System.out.print(newArray);
        console.close();
    }
}
