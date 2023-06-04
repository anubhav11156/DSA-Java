
public class SingleDimensionArray {
    int arr[] = null;

    // create a constructor and initialize the array
    public SingleDimensionArray(int sizeOfArray){ // ---> a constructor
        arr = new int[sizeOfArray];
        for (int i=0; i<sizeOfArray; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted){
        try {
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted");
            }else {
                System.out.println("This cell is already occupied!");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array!");

        }
    }

    public static void main(String[] args){
        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0, 1);
        sda.insert(7, 13);
        sda.insert(143, 78);
        sda.insert(0, 67);
    }
}
