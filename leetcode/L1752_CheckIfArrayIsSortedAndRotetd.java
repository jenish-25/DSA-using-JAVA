package leetcode;

public class L1752_CheckIfArrayIsSortedAndRotetd {
    public static void main(String[] args) {
       int[] nums = {1,4,1,2,3,5};
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length])
                count++;
        }
//        return (count<=1);
        System.out.println(count<=1);
    }
}
