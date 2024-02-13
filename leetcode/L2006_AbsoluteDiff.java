package leetcode;
import java.util.*;
public class L2006_AbsoluteDiff {
    public static void main(String[] args) {
      int[]  nums = {1,2,2,1};
      int k = 1;
      int count=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i: nums){
            int p1=i-k,p2=i+k;
            if(hm.containsKey(p1)){
                count+=hm.get(p1);
            }
            if(hm.containsKey(p2)){
                count+=hm.get(p2);
            }
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        System.out.println(count);
    }
}
