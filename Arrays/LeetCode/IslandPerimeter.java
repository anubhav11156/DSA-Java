package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class IslandPerimeter {

    public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int row = grid.length;
        int col = grid[0].length;
        int rowCount = 0;
        int colCount = 0;
        for(int i=0; i<row; i++ ){
            for(int j=0; j<col; j++){
                if(grid[i][j]==0){
                    continue;
                }else{
                    int l = j-1;
                    int r = j+1;
                    int u = i-1;
                    int b = i+1;

                    if(i==0 && j==0){
                        rowCount +=2;

                    }else if(i==row-1 && j==0){
                        rowCount++;
                    }else if(j==0){
                        colCount++;
                    }else if(j==col-1){
                        colCount++;
                    }
                }
            }
        }
        return perimeter;
    }

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int row, col;
        row = console.nextInt();
        col = console.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = console.nextInt();
            }
        }
        System.out.println("Array: "+Arrays.deepToString(arr));
        System.out.println("Answer: "+islandPerimeter(arr));
        console.close();
    }
}
