package leetcode;

public class L1464_MaxProductOf2Element {
    public static void main(String[] args) {
       int[] nums = {3,4,5,2};
        int max1=0;
        int max2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max1){
                max2=max1;
                max1=nums[i];
            }
            else if(nums[i]>max2 && nums[i]<max1){
                max2=nums[i];
            }
        }
        System.out.println((max1-1)*(max2-1));
    }
}
