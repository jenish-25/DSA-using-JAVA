package stack;

import java.util.Stack;

public class Q9_PostFixInInfix {
    public static void main(String[] args) {
        String s="ab+cd-*";
        Stack<String> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/'){
                String left=st.peek();
                st.pop();
                String right=st.peek();
                st.pop();
                String newS="("+right+s.charAt(i)+left+")";
                st.push(newS);
            }
            else{
                st.push(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(st.peek());
    }
}
