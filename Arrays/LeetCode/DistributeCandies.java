package LeetCode;

import java.util.Scanner;

public class DistributeCandies {

     public static int distributeCandies(int[] candyType) {
     int typeCount = 0;
      for(int i=0; i<candyType.length; i++){
          boolean isDuplicate = false;
          for(int j=i+1; j<candyType.length; j++){
              if(candyType[i]==candyType[j]){
                  isDuplicate=true;
                  break;
              }
          }
          if(!isDuplicate){
              typeCount++;
          }else{
            continue;
          }    
      }

      System.out.println("Type count: "+typeCount);

      if(typeCount>=candyType.length/2){
        return candyType.length/2;
      }else{
        return typeCount;
      }
    }

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int s;
        s = console.nextInt();
        int[] arr = new int[s];
        for(int i=0; i<s; i++){
            arr[i] = console.nextInt();
        }
        System.out.println("Answer: "+distributeCandies(arr));
        console.close();
    }
}
