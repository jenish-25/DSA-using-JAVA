package leetcode;

public class L1827_minOperationToMakeArrayIcreasing {
    public static void main(String[] args) {
       int[] nums = {1,5,2,4,1};
        int count=0;
        int curr=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=curr){
                int temp=curr-nums[i]+1;
                count += temp;
                curr++;
            }
            else{
                curr= nums[i];
            }
        }
        System.out.println(count);
    }
}
