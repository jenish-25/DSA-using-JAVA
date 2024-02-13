package leetcode;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;

public class L1389_CreateTargetArrInOrder {
    public static void main(String[] args) {
       int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        ArrayList<Integer> list=new ArrayList<>();
        int target[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        for(int i=0;i< list.size();i++){
            target[i]=list.get(i);
        }
        System.out.println(Arrays.toString(target));
    }
}
