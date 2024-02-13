package leetcode;

public class L724_FindPivotIndex {
    public static void main(String[] args) {
       int[] nums = {2,1,-1};
        int sum=0,x=-1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int temp=0;
        for(int i=0;i<nums.length;i++){
            temp+=nums[i];
            if(temp==sum){
                x=i;
                break;
            }
            sum-=nums[i];
        }
        System.out.println(x);
    }
}
