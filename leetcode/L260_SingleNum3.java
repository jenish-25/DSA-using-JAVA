package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class L260_SingleNum3 {
    public static void main(String[] args) {
       int[] nums = {1,2,1,3,2,5};
        ArrayList<Integer> arr=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if((nums[i]^nums[i+1])!=0){
                arr.add(nums[i+1]);
            }
        }
        System.out.println(arr);

    }
}
