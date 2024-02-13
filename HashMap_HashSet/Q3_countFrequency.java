package HashMap_HashSet;

import java.util.HashMap;
import java.util.Map;

public class Q3_countFrequency {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        //count frquency
        int[] arr={1,2,3,4,2,35,6,1,1};
        for (int i = 0; i < arr.length; i++) {
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
            else {
                int oldV=hm.get(arr[i]);
                hm.put(arr[i],oldV+1);
            }
        }
        for(Map.Entry me : hm.entrySet()){
            System.out.println(me.getKey()+ " " + me.getValue());
        }
    }
}
