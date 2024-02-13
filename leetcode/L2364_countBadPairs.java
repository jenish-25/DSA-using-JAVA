package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class L2364_countBadPairs {
    public static void main(String[] args) {
       int[] nums = {4,1,3,3};
        int n = nums.length;
        long badPair = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        long totalPair = (long) n * (n - 1) /2;
        long goodPair = 0;

        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i]-i)){
                goodPair+=map.get(nums[i]-i);
            }
            map.put((nums[i]-i),map.getOrDefault((nums[i]-i),0)+1);
        }
        badPair = totalPair-goodPair;
        System.out.println(badPair);
    }
}
