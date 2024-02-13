package leetcode;

import java.util.Arrays;

public class L2460_ApplyOperationsToArray {
    public static void main(String[] args) {
       int[] nums = {847,847,0,0,0,399,416,416,879,879,206,206,206,272};   //{1694,0,0,0,0,399,812,1758,0,412,0,206,272}
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) {
                nums[i] = nums[i] * 2;
                nums[i+1]=0;
            }
        }
        int ans[]=new int[nums.length];
       int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
              ans[j]=nums[i];
              j++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
