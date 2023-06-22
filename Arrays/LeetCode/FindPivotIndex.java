package LeetCode;

public class FindPivotIndex {
    public int getSum(int[] arr, int lastIndex, int firstIndex){
        int sum = 0;
        for(int i=firstIndex; i<=lastIndex; i++){
            sum += arr[i];
        }

        return sum;
    }
    public int pivotIndex(int[] nums) {
        int answer = -1;
        for( int i=0; i<nums.length; i++){
            int leftSum = getSum(nums, i-1,0 );
            int rightSum = getSum(nums,(nums.length-1),i+1);
            if(leftSum==rightSum){
                answer=i;
                break;
            }
        }
        return answer;
    }
}
