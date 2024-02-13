package leetcode;
import java.util.HashMap;

public class L2325_DecodeMassege {
    public static void main(String[] args) {
       String key = "the quick brown fox jumps over the lazy dog";
       String message = "vkbs bs t suepuv";
       StringBuilder sb=new StringBuilder();
       HashMap<Character,Character> hm=new HashMap<>();
       key=key.replace(" ","");
       char ch='a';
       for(char i: key.toCharArray()){
           if(hm.containsKey(i)==false){
               hm.put(i,ch);
               ch++;
           }
       }
       for(char i:message.toCharArray()){
           if(hm.containsKey(i)){
               sb.append(hm.get(i));
           }
           else{
               sb.append(i);
           }
       }
        System.out.println(sb);
    }
}
