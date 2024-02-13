package leetcode;

public class L540_SinglElementInSoretd {
    public static void main(String[] args) {
       int[] nums = {1,2,2,3,3,4,4,8,8};
       int n= nums.length;
       int mid=0;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            mid=left+(right-left)/2;
            if(mid>0 && mid%2==0 && nums[mid-1]==nums[mid]){
                right=mid-1;
            }
            else if(mid<nums.length-1 && mid%2==0 && nums[mid+1]==nums[mid]){
                left=mid+1;
            }
            else if(mid<nums.length-1 && mid%2!=0 && nums[mid+1]==nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        System.out.println(nums[right]);
    }
}
