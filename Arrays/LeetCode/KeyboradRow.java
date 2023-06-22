package LeetCode;

import java.util.ArrayList;

public class KeyboradRow {
    public String[] findWords(String[] words) {
      ArrayList<String> newArray = new ArrayList<>();
      String[] keyboard = {"qwertyuiop","asdfghjkl","zxcvbnm"};
      for(String word : words){
          String finalWord = word.toLowerCase();
          int k=0;
          while(k<3){
              int counter = 0;
              for(int i=0; i<finalWord.length(); i++){
                    for(int j=0; j<keyboard[k].length(); j++){
                        if(finalWord.charAt(i)==keyboard[k].charAt(j)){
                            counter++;
                            break;
                        }
                    }
                }
            k++;
            if(counter==finalWord.length()){
              // means present
              newArray.add(word);
          }
          }
          
          
      }
      String[] array = newArray.toArray(new String[newArray.size()]);
      return array;  
    }
}
