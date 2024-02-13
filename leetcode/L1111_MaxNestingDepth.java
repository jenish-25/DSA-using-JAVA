package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class L1111_MaxNestingDepth {
    public static void main(String[] args) {
       String s = "()(())()";
       int[] ans=new int[s.length()];
       int lvl=0;
       for(int i=0;i<s.length();i++){
           char c=s.charAt(i);
           if(c=='('){
               ans[i]=++lvl%2;
           }
           else{
               ans[i]=lvl--%2;
           }
       }
        System.out.println(Arrays.toString(ans));
    }
}
