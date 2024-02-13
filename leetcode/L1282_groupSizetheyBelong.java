package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class L1282_groupSizetheyBelong {
    public static void main(String[] args) {
       int[] groupSizes = {2,1,3,3,3,2};
       List<List<Integer>> ans=new ArrayList<>();
        HashMap<Integer,List<Integer>> hm=new HashMap<>();
        int n= groupSizes.length;
        for(int i=0;i<n;i++){
            int size=groupSizes[i];
            List<Integer> temp=hm.getOrDefault(size,new ArrayList<>());
            temp.add(i);
            hm.put(size,temp);
            if(temp.size() == size){
                ans.add(temp);
                hm.remove(size);
            }
        }
        System.out.println(ans);
    }
}
