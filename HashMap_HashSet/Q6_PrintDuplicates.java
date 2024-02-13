package HashMap_HashSet;

import java.util.HashMap;
import java.util.Map;

public class Q6_PrintDuplicates {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int arr[] = {12, 11, 40, 12, 5, 6, 5, 12, 11};
        for (int i = 0; i < arr.length; i++) {
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else hm.put(arr[i],1);
        }
        for(Map.Entry<Integer,Integer> me: hm.entrySet()){
            if(me.getValue()>1){
                System.out.print(me.getKey()+" ");
            }
        }
    }
}
