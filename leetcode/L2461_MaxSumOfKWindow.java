package leetcode;

import java.util.HashMap;
import java.util.Map;

public class L2461_MaxSumOfKWindow {
    public static void main(String[] args) {
       int[] nums = {1,5,4,2,9,9,9};
        int k = 3;
        int i=0;
        int j=0;
        long max=0;
        long sum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        while( j < nums.length){
            hm.put(nums[j] , hm.getOrDefault(nums[j], 0) + 1); //putting element to map
            sum += nums[j];         //updating currsum
            if(j - i + 1 == k){         //Checking in every 3 pairs
                if(hm.size() == k){
                    max = Math.max(sum , max);        //updating maxsum
                }
                sum -= nums[i];
                //deducting first element of the triplet as we move forwardhm.put(nums[i], hm.get(nums[i])-1);
                hm.put(nums[i], hm.get(nums[i])-1);
                if (hm.get(nums[i]) == 0) hm.remove(nums[i]);  //updating map
                i++;
            }
            j++;
        }
        System.out.println(max);
    }
}
