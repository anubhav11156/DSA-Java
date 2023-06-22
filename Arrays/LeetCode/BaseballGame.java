package LeetCode;

import java.util.ArrayList;

public class BaseballGame {
    ArrayList<Integer> newArray = new ArrayList<>();
        int finalSum = 0;

        public void cOpertaion(String c){
            int lastIndex = newArray.size()-1;
            newArray.remove(lastIndex);
        }

        public void dOpertaion(String d){
            int size = newArray.size();
            int currentScore = 2*newArray.get(size-1);
            newArray.add(currentScore);
        }

        public void plusOpertaion(String plus){
            // sum of previous two score not total score
            int lastElementIndex = newArray.size()-1;
            int lastElement = newArray.get(lastElementIndex); 
            int secondLastElementIndex = newArray.size()-2;
            int secondLastElement = newArray.get(secondLastElementIndex); 
            int prevTwoSum = lastElement + secondLastElement;
            newArray.add(prevTwoSum);
        }  

        public void recordOperation(int value){
            newArray.add(value);
        } 

        public int totalSum(ArrayList<Integer> array){
            int sum = 0;
            for(int i=0; i<array.size(); i++){
                sum += array.get(i);
            }
            return sum;
        }

    public int calPoints(String[] operations) {

        for(int i=0; i<operations.length; i++){
            switch (operations[i]) {
                case "C":
                    cOpertaion(operations[i]);
                    break;
                case "D":
                    dOpertaion(operations[i]);
                    break;
                case "+":
                    plusOpertaion(operations[i]);
                    break;
                default:
                    recordOperation(Integer.parseInt(operations[i]));
            }
        }


        finalSum = totalSum(newArray);

        return finalSum;
    }
}
