package leetcode;

import java.util.Arrays;

public class L1720_DecodeXorArray {
    public static void main(String[] args) {
        int[] encoded = {1,2,3};
        int first = 1;
        int ans[]=new int[encoded.length+1];
        ans[0]=first;
        int j=0;
        for(int i=1;i<ans.length;i++){
            encoded[j]=first^encoded[j];
            ans[i]=encoded[j];
            j++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
