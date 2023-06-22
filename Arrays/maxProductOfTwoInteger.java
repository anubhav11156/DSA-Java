import java.util.*;

public class maxProductOfTwoInteger {

    public static int maxProduct(int[] arr){
        int maxProduct = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]*arr[j]>maxProduct){
                    maxProduct = arr[i]*arr[j];
                }
            }
        }
        return maxProduct;
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int size;
        System.out.print("Enter size: ");
        size = console.nextInt();
        int[] array = new int[size];
        System.out.print("Enter array elements: ");
        for(int i=0; i<size; i++){
            array[i] = console.nextInt();
        }
        System.out.print(Arrays.toString(array));
        System.out.print("Max product: "+maxProduct(array));
        console.close();
    }
}
