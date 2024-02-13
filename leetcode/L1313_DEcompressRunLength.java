package leetcode;

import java.util.Arrays;

public class L1313_DEcompressRunLength {
    public static void main(String[] args) {
       int[] nums = {1,1,2,3};
        int freq=0;
        for(int i=0;i<nums.length;i=i+2)
        {
            freq+=nums[i];
        }
        int []ans=new int[freq];
        int start=0;
        for(int i=0;i<nums.length;i=i+2)
        {
            Arrays.fill(ans,start,start+nums[i],nums[i+1]);
            start+=nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
