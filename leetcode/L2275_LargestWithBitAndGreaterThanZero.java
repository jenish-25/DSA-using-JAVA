package leetcode;

import java.util.Arrays;

public class L2275_LargestWithBitAndGreaterThanZero {
    public static void main(String[] args) {
      int[] candidates = {16,17,71,62,12,24,14};

        int ans=0,count=0;

        for(int i=1;i<candidates.length;i++){
            ans = candidates[i] & candidates[i-1];
            if(candidates.length==1){
                System.out.println(Arrays.toString(candidates));
            }
            if(ans>0){
                count++;
            }
        }
        System.out.println(count);
    }
}
