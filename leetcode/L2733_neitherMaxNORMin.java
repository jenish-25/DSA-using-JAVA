package leetcode;

public class L2733_neitherMaxNORMin {
    public static void main(String[] args) {
        int nums[]={1,3,4,2};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int j=0;j<nums.length;j++){
            if(min>nums[j]){
                min=nums[j];
            }
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=max && nums[k]!=min ){
                System.out.println(nums[k]);
                return;
            }
        }
        System.out.println(-1);
    }
}
