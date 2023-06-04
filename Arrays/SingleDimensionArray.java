
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


    public void traverseArray() {
        try{
            for (int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        } catch(Exception e) {
            System.out.println("Array no longer exist!");
        }
        
    }
    // search value in array
    public void searchInArray(int valueToSearch){
        for (int i=0; i>arr.length; i++){
            if(arr[i]==valueToSearch){
                System.out.print("Value is found at the index: " + i);
                return;
            }
        }
        System.out.println("Value is not found!");
    }

    public void deleteValue()

    public static void main(String[] args){
        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0, 1);
        sda.insert(7, 13);
        sda.insert(143, 78);
        sda.insert(0, 67);
        sda.traverseArray();
        sda.searchInArray(20);
        sda.searchInArray(13);
    }
}
