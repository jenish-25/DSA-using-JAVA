package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class L1679_MaxNumOfKSumPair {
    public static void main(String[] args) {
       int[] nums = {3,1,3,4,3};
       int k = 6;
        Arrays.sort(nums);
        int ans=0;
        for(int i=0,y=nums.length-1;i<y;){
            if(nums[i]+nums[y]==k){
                ans++;
                i++;
                y--;
            }
            else if(nums[i]+nums[y]<k){
                i++;
            }
            else{
                y--;
            }
        }
        System.out.println(ans);
    }
}
