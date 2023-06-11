
import java.util.*;

// Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.
public class missingNumbers {

    public static double returnMissing(int[] array){
        double missing;
        double sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        int n = (array.length)+1;

        double actualSum = (n*(n+1))/2;
        missing = actualSum - sum;
        return missing;
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        int[] array = new int[size];
        System.out.print("Enter elements: ");
        for(int i=0; i<size; i++){
            array[i] = console.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.print("Missing number is: "+returnMissing(array));
        console.close();
    }
}
