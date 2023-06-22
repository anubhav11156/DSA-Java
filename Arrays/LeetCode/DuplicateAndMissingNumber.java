package LeetCode;

public class DuplicateAndMissingNumber {
    public int[] findErrorNums(int[] nums) {
        int[] answer = new int[2];
        int duplicateIndex = 0;
        int totalSum = 0;
        for(int i=0; i<nums.length; i++){
            boolean isDuplicate = false;
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    isDuplicate=true;
                    duplicateIndex = j;
                    break;
                }
            }
            if(isDuplicate){
                break;
            }   
        }

        for(int i=0; i<nums.length; i++){
            if(i==duplicateIndex){
                continue;
            }else{
                totalSum+=nums[i];
            }
        }
        int n = nums.length;
        int missingNumber = n*(n+1)/2 - totalSum;
        answer[0] = nums[duplicateIndex];
        answer[1] = missingNumber;

        return answer;
    }
}
