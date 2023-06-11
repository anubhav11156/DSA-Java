import java.util.*;

public class diagonalSumOf2DArray {

    public static int sum(int[][] arr){
        int sum = 0;
        // logic to here
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(i==j){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Row : ");
        int row = console.nextInt();
        System.out.print("Column : ");
        int col = console.nextInt();
        int[][] array = new int[row][col];
        System.out.print("Enter elements : ");
        for(int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                array[i][j] = console.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("Sum of diagonal element: " + sum(array));
        console.close();
    }
}
