package leetcode;

import java.util.Arrays;

public class L2149_RearrangeWithNegative {
    public static void main(String[] args) {
       int[] nums = {3,1,-2,-5,2,-4};
        int j=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
