package LeetCode;

import java.util.Scanner;

public class MaximumProductOfThreeNumbers {

    public static int maximumProduct(int[] nums) {
        if (nums.length <= 3) {
            return nums[0] * nums[1] * nums[2];
        }
        int product = 1;
        int k = 3;
        for (int i = 0; i < k; i++) {
            product *= nums[i];
        }

        int maxProduct = product;
        for (int i = k; i < nums.length; i++) {
            product = product * nums[i];
            product /= nums[i - k];
            maxProduct = Math.max(maxProduct, product);
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int s;
        s = console.nextInt();
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = console.nextInt();
        }
        System.out.println("Answer: " + maximumProduct(arr));
        console.close();
    }
}
