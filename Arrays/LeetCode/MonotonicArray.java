package LeetCode;

import java.util.Scanner;

public class MonotonicArray {

    public static boolean isMonotonic(int[] nums) {
        int previous1 = nums[0];
        int previous2 = nums[0];
        boolean monotonicIncreasing = false;
        boolean monotonicDecreasing = false;
        for (int num : nums) {
            int current = num;
            if (current >= previous1) {
                previous1 = num;
                monotonicIncreasing = true;
            } else {
                monotonicIncreasing = false;
                break;
            }
        }

        for (int num : nums) {
            int current = num;
            if (current <= previous2) {
                previous2 = num;
                monotonicDecreasing = true;
            } else {
                monotonicDecreasing = false;
                break;
            }
        }

        System.out.println("Monotonic Icreasing: "+monotonicIncreasing);
        System.out.println("Montonic Decreasing: "+monotonicDecreasing);
        if (monotonicDecreasing || monotonicIncreasing) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int s;
        s = console.nextInt();
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = console.nextInt();
        }
        System.out.println("Answer: " + isMonotonic(arr));
        console.close();
    }
}
