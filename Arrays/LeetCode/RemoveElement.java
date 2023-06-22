package LeetCode;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int counter=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==val){
                counter++;
                nums[i]=50;
            }
        }

        // now sort in asecending order
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int temp = 0;
                if(nums[i]>nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return (nums.length - counter);
    }
}
