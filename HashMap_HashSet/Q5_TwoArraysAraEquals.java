package HashMap_HashSet;

import java.util.HashMap;

public class Q5_TwoArraysAraEquals {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,3, 4, 5};
        int[] arr2 = {2, 4, 1,3,5, 3};

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i : arr){
            hm.put(i,hm.getOrDefault(i,1));
        }
        for(int j: arr2){
            if(hm.containsKey(j)) {
                hm.put(j, hm.get(j) - 1);
                if (hm.get(j) == 0) {
                    hm.remove(j);
                }
            }
        }
        if(hm.isEmpty()){
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
}
