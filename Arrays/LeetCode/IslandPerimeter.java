package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class IslandPerimeter {

    public static int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4;

                    // now check for left and upper cell
                    if (i > 0 && grid[i - 1][j] == 1) { // check for left
                        perimeter -= 2;
                    }

                    if (j > 0 && grid[i][j - 1] == 1) { // check for upper
                        perimeter -= 2;
                    }
                }

            }
        }
        return perimeter;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int row, col;
        row = console.nextInt();
        col = console.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = console.nextInt();
            }
        }
        System.out.println("Array: " + Arrays.deepToString(arr));
        System.out.println("Answer: " + islandPerimeter(arr));
        console.close();
    }
}
