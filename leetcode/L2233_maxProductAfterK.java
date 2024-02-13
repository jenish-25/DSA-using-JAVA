package leetcode;

public class L2233_maxProductAfterK {
    public static void main(String[] args) {
       int[] nums = {9,7,8};
       int k = 9;
        int min=Integer.MAX_VALUE;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
                j=i;
            }
        }
        nums[j]+=k;
        int mul=1;
        for(int i:nums){
            mul*=i;
        }
        System.out.println(mul);
    }
}
