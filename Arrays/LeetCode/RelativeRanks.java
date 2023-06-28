package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class RelativeRanks {

    public static String[] findRelativeRanks(int[] score) {
        String[] answer = new String[score.length];
        int[] temp = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            temp[i] = score[i];
        }

        for (int i = 0; i < score.length; i++) {
            for (int j = i+1; j < score.length; j++) {
                if (temp[i] < temp[j]) { 
                    int swap = temp[i];
                    temp[i] = temp[j];
                    temp[j] = swap;
                }
            }
        }

        System.out.println("Afrer sorting: " + Arrays.toString(temp));

        for (int i = 0; i < score.length; i++) {

            switch (getRank(temp, score[i])) {
                case 1:
                    answer[i] = "Gold Medal";
                    break;
                case 2:
                    answer[i] = "Silver Medal";
                    break;
                case 3:
                    answer[i] = "Bronze Medal";
                    break;
                default:
                    answer[i] = Integer.toString(getRank(temp, score[i]));
            }
        }

        return answer;
    }

    public static int getRank(int[] arr, int n) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                index = i;
                break;
            }
        }
        return index + 1;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int s;
        s = console.nextInt();
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = console.nextInt();
        }
        System.out.println("Answer: " + Arrays.toString(findRelativeRanks(arr)));
        console.close();
    }
}
