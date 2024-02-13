package leetcode;

import java.util.Stack;

public class L1003_CheckIfWordIsValidAfterSubstitution {
    public static void main(String[] args) {
       String s = "abccba";
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
            if(s.charAt(i)=='c' && st.size()>=3){
                char a,b,c;
                c=st.pop();
                b=st.pop();
                a=st.pop();
                if(a=='a' && b=='b' && c=='c'){
                    continue;
                }
                else {
                    st.push(a);
                    st.push(b);
                    st.push(c);
                }
            } else if (s.charAt(i)=='c') {
                System.out.println(false);
                return;
            }
        }
        System.out.println(st.empty());
    }
}
