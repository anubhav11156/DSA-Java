package LeetCode;

import java.util.ArrayList;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> myArray = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){

                    if (!myArray.contains(nums1[i])) {
                        myArray.add(nums1[i]);
                    }

                    break;
                }
            }
        }

        int[] arr = new int[myArray.size()];
        for (int i = 0; i < myArray.size(); i++) {
            arr[i] = myArray.get(i);
        }

        return arr;
    }
}
