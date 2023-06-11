import java.util.*;


//Write a function called middle that takes an array and returns a new array that contains all but the first and last elements. 
public class middleFunction {

    public static ArrayList<Integer> middle(int[] arr){
        // int temp = new int[];
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if((i==0) || (i==(arr.length)-1) ){
                continue;
            }else{
                temp.add(arr[i]);
            }
        }
        return temp;
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        System.out.print("Size : ");
        int size = console.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter elements : ");
        for(int  i=0; i<arr.length; i++){
            arr[i] = console.nextInt();
        }
        System.out.print("Array : "+Arrays.toString(arr));
        ArrayList<Integer> newArray = middle(arr);
        System.out.print("\nNew array : "+newArray);
        console.close();
    }
}
