package leetcode;

import java.util.Arrays;

public class L26_RemoveDuplicateFromSorted {
    public static void main(String[] args) {
       int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int cont=1,count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[cont]=nums[i+1];
                cont++;
                count++;
            }
        }
        System.out.println(count);
    }
}
