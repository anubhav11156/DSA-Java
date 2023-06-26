
import java.util.ArrayList;
import java.util.*;

public class ArrayListQuestion1 {
    public static void main(String[] args){
        // create function which calculates the sum and product of elements of array
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        System.out.println(arr);

        // sum
        int sum = 0;
        for(int number:arr){
            sum+=number;
        } 

        // TC = O(n)

        System.out.println("Sum : "+sum);

        // product
        int product = 1;

        Iterator<Integer> iterator = arr.iterator();
        while(iterator.hasNext()){
            int current = iterator.next();
            product *= current;
        }

        // TC = O(n);

        System.out.println("Product : "+product);

        
    }
}
