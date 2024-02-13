package leetcode;

import java.util.ArrayList;

public class L442_FindAllDupllicartes {
    public static void main(String[] args) {
       int[] nums = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int idx = Math.abs(nums[i])-1;
            if(nums[idx]<0){
                ans.add(idx+1);
            }
            else{
                nums[idx]= -nums[idx];
            }
        }
        System.out.println(ans);
    }
}
