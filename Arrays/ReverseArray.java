import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(34,90,3,21));
        System.out.println(arr);
        reverse(arr); // goes as reference
        System.out.println("Reverse array: "+arr);
    }

    public static void reverse(ArrayList<Integer> arr){
        int start = 0;
        int last = arr.size()-1;
        while(start<last){
           int temp = arr.get(start);
           arr.set(start, arr.get(last));
           arr.set(last, temp);
           start++;
           last--;
        }
    }
}
