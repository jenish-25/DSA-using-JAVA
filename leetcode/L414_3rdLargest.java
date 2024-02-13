package leetcode;

import java.util.Arrays;

public class L414_3rdLargest {
    public static void main(String[] args) {
        int nums[]={5,2,2};
        long m1=Long.MIN_VALUE;
        long m2=Long.MIN_VALUE;
        long m3=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>m1){
                m3=m2;
                m2=m1;
                m1=nums[i];
            }
            else if(nums[i]>m2 && nums[i]<m1){
                m3=m2;
                m2=nums[i];
            }
            else if(nums[i]>m3 && nums[i]<m2){
                m3=nums[i];
            }
        }
        if(m3==Long.MIN_VALUE){
            System.out.println((int)m1);
        }
        else{
            System.out.println((int)m3);
        }
    }
}
