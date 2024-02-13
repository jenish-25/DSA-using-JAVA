package leetcode;

import java.util.Arrays;

public class L2149_RearrangeArrayBySign {
    public static void main(String[] args) {
      int[] nums = {28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
        if(nums.length==2){
            if(nums[0]<0){
                int temp=nums[1];
                nums[1]=nums[0];
                nums[0]=temp;
            }
        }
        int j=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j+=2;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
