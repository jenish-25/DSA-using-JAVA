package leetcode;

public class L153_findMinInRotatedSoretdArray {
    public static void main(String[] args) {
      int[]  nums = {1,2,3,4,5};
      int n=nums.length;
        if (nums[0] < nums[nums.length - 1] || nums.length == 1) {
            System.out.println(nums[0]);
            return;
        }
        int s = 0;
        int e = n-1;
        int mid = s + (e-s)/2;

        while(s<e)
        {
            if(nums[0] <= nums[mid]) {
                s = mid+1;
            }
            else if(nums[0] > nums[mid]) {
                e = mid;
            }
            mid = s+(e-s)/2;
        }
        System.out.println(nums[s]);
    }
}
