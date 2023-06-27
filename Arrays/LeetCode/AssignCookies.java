package LeetCode;

import java.util.Scanner;

public class AssignCookies {

     public static int findContentChildren(int[] g, int[] s) {
        int childrens = 0;
        for(int i=0; i<g.length; i++){
            for(int j=0; j<s.length; j++){
                if(g[i]==s[j]){
                    childrens++;
                    break;
                }
            }
            if(childrens==g.length){
                break;
            }
        }
        return childrens;
    }

     public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int s;
        s = console.nextInt();
        int[] arr1 = new int[s];
        for (int i = 0; i < s; i++) {
            arr1[i] = console.nextInt();
        }
        int n;
        n = console.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = console.nextInt();
        }
        System.out.println("Answer: " + findContentChildren(arr1,arr2));
        console.close();
    }
}
