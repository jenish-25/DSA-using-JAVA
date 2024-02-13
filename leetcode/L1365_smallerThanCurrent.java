package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class L1365_smallerThanCurrent {
    public static void main(String[] args) {
      int[] nums = {8,1,2,2,3};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }
            else {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int count=0;
            for(int t: hm.keySet()){
                if(t<nums[i]){
                    count+=hm.get(t);
                }
            }
            nums[i]=count;
        }
        System.out.println(Arrays.toString(nums));
    }
}
