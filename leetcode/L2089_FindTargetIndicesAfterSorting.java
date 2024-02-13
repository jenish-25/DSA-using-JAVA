package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L2089_FindTargetIndicesAfterSorting {
    public static void main(String[] args) {
       int[] nums = {1,2,5,2,3};
        int target = 2;
        int belowTCount=0, tCount=0;
        for(int n : nums){
            if(n<target)
                belowTCount++;
            else if(n==target)
                tCount++;
        }
        List<Integer> ans = new ArrayList<>();
        for(int t=0;t<tCount;t++){
            ans.add(belowTCount);
            belowTCount++;
            }

        System.out.println(ans);
    }
}
