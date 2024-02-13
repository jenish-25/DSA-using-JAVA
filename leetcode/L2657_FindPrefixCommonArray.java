package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class L2657_FindPrefixCommonArray {
    public static void main(String[] args) {
       int[] A = {1,3,2,4}, B = {3,1,2,4};
        int[] ans=new int[A.length];
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashMap<Integer,Integer> hm2=new HashMap<>();
        for(int i=0;i<A.length;i++){
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
            hm2.put(B[i],hm2.getOrDefault(B[i],0)+1);
            for(int j:hm.keySet()){
                if(hm2.containsKey(j)){
                    ans[i]+=Math.min(hm.get(j),hm2.get(j));
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
