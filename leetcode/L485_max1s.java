package leetcode;

public class L485_max1s {
    public static void main(String[] args) {
       int[] nums = {1,0,1,1,0,1};
        int n=nums.length;
        int count=0;
        int result=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                result=Math.max(result,count);
                count=0;
            }
            else count++;
        }
        result=Math.max(result,count);
        System.out.println(result);
    }
}
