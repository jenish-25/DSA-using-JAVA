package leetcode;

import java.util.HashMap;

public class L974_SubarraySumDivisibleByK {
    public static void main(String[] args) {
      int[]  nums = {4,5,0,-2,-3,1};
      int k = 5;
      int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int sum=0;
        int rem=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            rem= sum%k;
            if(rem<0){
                rem+=k;
            }
            if(hm.containsKey(rem)){
                ans+=hm.get(rem);
                hm.put(rem,hm.get(rem)+1);
            }
            else{
                hm.put(rem,1);
            }
        }
        System.out.println(ans);
    }
}
