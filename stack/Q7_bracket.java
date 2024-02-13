package stack;

import java.util.Stack;

public class Q7_bracket {
    public static void main(String[] args) {
        String s="{[({})]}(";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            } else {
                if (st.isEmpty()) {
                    System.out.println("not balanced");
                    return;
                }
                char popped = st.pop();
                if ((s.charAt(i) == ')' && popped != '(') || (s.charAt(i) == '}' && popped != '{') ||
                        (s.charAt(i) == ']' && popped != '[')) {
                    System.out.println("not balanced");
                    return;
                }
            }
        }
        if(st.isEmpty()){
            System.out.println("balanced");
        }
        else {
            System.out.println("not balanced");
        }
    }
}
