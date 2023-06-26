package LeetCode;

import java.util.Scanner;

public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        if(flowerbed.length==1){
            if(flowerbed[0]==0){
                flowerbed[0] = 1;
                count++;
            }
        }else {
            for(int i=0; i<flowerbed.length; i++){
            if(i==0){
                if(flowerbed[i]==1){
                    continue;
                }else{
                    if(flowerbed[i+1]==0){
                        // plant
                        flowerbed[i]=1;
                        System.out.print("Here");
                        count++;
                    }else{
                        continue;
                    }
                }
            } else if(i==flowerbed.length-1){
                if(flowerbed[i]==1){
                    continue;
                }else{
                    if(flowerbed[i-1]==0){
                        // plant
                        flowerbed[i]=1;
                        count++;
                    }else{
                        continue;
                    }
                }
            }  else {
                if(flowerbed[i]==1){
                    continue;
                }else{
                    // means zero then look and plant
                    if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
                        // plant
                        flowerbed[i]=1;
                        count++;
                    }
                }
            }
        }
        }
        
        System.out.println("Count: "+count);

        if(count==n || count>n){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int s;
        s = console.nextInt();
        int n;
        n = console.nextInt();
        int[] arr = new int[s];
        for(int i=0; i<s; i++){
            arr[i] = console.nextInt();
        }
        System.out.println("Answer: "+canPlaceFlowers(arr, n));
        console.close();
    }
}
