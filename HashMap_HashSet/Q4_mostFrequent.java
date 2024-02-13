package HashMap_HashSet;
import java.util.HashMap;
import java.util.Map;

public class Q4_mostFrequent {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] arr={40,30,50,30,60,80,30};
        for (int i = 0; i < arr.length; i++) {
            if(hm.containsKey(arr[i])){
                int freq=hm.get(arr[i]);
                freq++;
                hm.put(arr[i],freq);
            }
            else {
                hm.put(arr[i],1);
            }
        }
        int count=0,res=-1;
        for(Map.Entry<Integer,Integer> me: hm.entrySet()){
            if(count < me.getValue()){
                res=me.getKey();
                count=me.getValue();
            }
        }
        System.out.println(res+"--> "+count);
    }
}
