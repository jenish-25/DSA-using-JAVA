package leetcode;

public class L33_searchInsertPosition {
    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 6};         //{4,5,6,7,0,1,2} t=1
        int target = 6;
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                System.out.println(mid);
                return;
            }
            if(nums[start]<=nums[mid]){
                if(nums[start]<=target && nums[mid]>=target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(nums[end]>=target && nums[mid]<=target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        System.out.println(-1);

    }
}
