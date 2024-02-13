package leetcode;

import java.util.Arrays;

public class L2433_originArrayOfPrefixXor {
    public static void main(String[] args) {
        int[] pref = {5,2,0,3,1};
        int[] ans=new int[pref.length];
        ans[0]=pref[0];

        for(int i=0;i< pref.length-1;i++){
            ans[i+1]=pref[i]^pref[i+1];
        }
        System.out.println(Arrays.toString(ans));
    }
}
