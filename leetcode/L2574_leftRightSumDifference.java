package leetcode;

import java.util.Arrays;

public class L2574_leftRightSumDifference {
    public static void main(String[] args) {
      int[] nums = {10,4,8,3};
        int ans1[]=new int[nums.length];
        int ans2[]=new int[nums.length];
        int lsum=0;
        for(int i=0;i<nums.length;i++){
            ans1[i]=lsum;
            lsum+=nums[i];
        }
        int rsum=0;
        for(int i=nums.length-1;i>=0;i--){
            ans2[i]=rsum;
            rsum+=nums[i];
        }
        System.out.println(Arrays.toString(ans1));
        System.out.println(Arrays.toString(ans2));
        for(int i=0;i<ans2.length;i++){
            ans2[i]=Math.abs(ans1[i]-ans2[i]);
        }
        System.out.println(Arrays.toString(ans2));
    }
}
