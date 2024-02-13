package leetcode;

import java.util.Arrays;

public class L977_SquareOfSoretdArray {
    public static void main(String[] args) {
       int[] nums = {-4,-1,0,3,10};
        int start=0;
        int end=nums.length-1;
        int res[]=new int[nums.length];
        int ls=nums[start]*nums[start];
        int rs=nums[end]*nums[end];
        for(int i=end;i>=0 && start<end;i--){
            if(rs>=ls){
                res[i]=rs;
                end--;
                rs=nums[end]*nums[end];
            }
            else{
                res[i]=ls;
                start++;
                ls=nums[start]*nums[start];
            }
        }
        rs=nums[end]*nums[end];
        res[0]=rs;
        System.out.println(Arrays.toString(res));
    }
}
