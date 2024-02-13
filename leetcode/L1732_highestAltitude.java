package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class L1732_highestAltitude {
    public static void main(String[] args) {
       int[] gain = {4,-3,-2,-1,4,3,2};
//       int ans[]=new int[gain.length+1];    //[0,-5,-4,1,1,-6];

        int maxAlt = gain[0] > 0 ? gain[0] : 0;
        for(int i = 1; i < gain.length; i++){
            gain[i] += gain[i-1];
            if(gain[i] > maxAlt){
                maxAlt = gain[i];
            }
        }
        System.out.println(maxAlt);
    }
}
