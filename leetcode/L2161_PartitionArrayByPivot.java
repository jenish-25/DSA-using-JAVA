package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class L2161_PartitionArrayByPivot {
    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 10;

        int ans[]=new int[nums.length];
        int  j=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]<pivot){
                ans[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i< nums.length;i++){
            if(nums[i]==pivot){
                ans[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i< nums.length;i++){
            if(nums[i]>pivot){
                ans[j]=nums[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
