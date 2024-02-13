package stack;

import java.util.Stack;

public class Q10_PrefixToPostFix {
    public static void main(String[] args) {
        String s="*+ab-cd";
        Stack<String> st=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/'){
                String left=st.peek();
                st.pop();
                String right=st.peek();
                st.pop();
                String newS=left+right+s.charAt(i);
                st.push(newS);
            }
            else{
                st.push(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(st.peek());
    }
}
