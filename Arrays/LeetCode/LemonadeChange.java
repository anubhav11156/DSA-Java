package LeetCode;

import java.util.Scanner;

public class LemonadeChange {

    public static boolean lemonadeChange(int[] bills) {
        int bill_5 = 0;
        int bill_10 = 0;
        boolean answer = false;
        if (bills[0] == 10 || bills[0] == 20) {
            return answer;
        } else {
            for (int i = 0; i < bills.length; i++) {
                if (bills[i] == 5) {
                    bill_5++;
                } else if (bills[i] == 10) {
                    bill_10++;
                }
                int change = bills[i] - 5; // 0, 10, 15
                switch (change) {
                    case 0:
                        answer = true;
                        break;
                    case 5:
                        if (bill_5 >= 1) {
                            // can give
                            answer = true;
                            bill_5--;
                        }
                        break;
                    case 15:
                        if (bill_5 >= 3 || (bill_10 >= 1 && bill_5 >= 1)) {
                            // can give
                            if (bill_10 == 0) {
                                // can give only 5
                                bill_5 -= 3;
                                answer = true;
                            } else {
                                bill_10--;
                                bill_5--;
                            }

                        } else {
                            answer = false;
                            return answer;
                        }
                        break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n;
        n = console.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = console.nextInt();
        }
        System.out.println("Answer: " + lemonadeChange(arr));
        console.close();
    }
}
