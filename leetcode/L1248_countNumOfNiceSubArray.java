package leetcode;

public class L1248_countNumOfNiceSubArray {
    public static void main(String[] args) {
        int[] nums = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        int i=0;
        int j=0;
        int oddCount=0;
        int count=0;
        int temp=0;
        while(j<nums.length){
            if(nums[j]%2==1){
                oddCount++;
                temp=0;
            }
            while(oddCount==k){
                temp++;
                if(nums[i]%2==1){
                    oddCount--;
                }
                i++;
            }
            count+=temp;
            j++;
        }
        System.out.println(count);
    }
}
