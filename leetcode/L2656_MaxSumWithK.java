package leetcode;

import java.util.Arrays;

public class L2656_MaxSumWithK {
    public static void main(String[] args) {
     int[] nums = {5,5,5};
     int k=2;
     int max=Integer.MIN_VALUE;
     int idx=0;
     int sum=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            idx=i;
        }
        int temp=max;
        for(int j=1;j<=k;j++){
            temp+=1;
        }
            nums[idx-1]=temp;
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
        }
        System.out.println(sum);
    }
}
