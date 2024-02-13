package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class L2553_SeparateDigitInArray {
    public static void main(String[] args) {
       int[] nums = {133,25,83,77};
        int n = 0, t;
        for(int i: nums){
            while(i!=0){
                n++;
                i/=10;
            }
        }
        int ans[] = new int[n];
        for(int i=nums.length-1; i>=0; i--){
            t = nums[i];
            while(t!=0){
                n--;
                ans[n] = t%10;
                t/=10;
            }
        }
        System.out.println(Arrays.toString(ans));
        }
}
