package leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class L1441_BuildArrayWithStack {
    public static void main(String[] args) {
       int[] target = {1,3};
        int n = 4;
        int j=1;
        Stack<String> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(i== target.length){
                break;
            }
            st.push("push");
            if(target[i]!=j){
                st.push("pop");
                i--;
            }
            j++;
        }
        System.out.println(st);
    }
}
