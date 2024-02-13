package stack;

import java.util.Stack;

public class Q1_reverse {
    public static void main(String[] args) {
        String s="hello";
        Stack<String> st=new Stack<>();
        String newS="";
        for(int i=0;i<s.length();i++){
            st.push(String.valueOf(s.charAt(i)));
        }
        for (int i = 0; i < s.length(); i++) {
            newS+=st.pop();
        }
        System.out.println(newS);
    }
}
