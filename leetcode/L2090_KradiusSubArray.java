package leetcode;

import java.util.Arrays;

public class L2090_KradiusSubArray {
    public static void main(String[] args) {
        int[] nums = {7,4,3,9,1,8,5,2,6};
        int k = 3;
        int n=nums.length;
        int window=2*k+1;
        long sum=0;
        int[] ans=new int[n];
        Arrays.fill(ans,-1);
//        if(n<window) return ans;
        for(int i=0;i<n;i++){
            sum += nums[i];
            if( i - window >=0){
                sum -= nums[i-window];
            }
            if(i >= window -1){
                ans[i-k]=(int) (sum/window);
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
