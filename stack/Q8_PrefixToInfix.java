package stack;

import java.util.Stack;

public class Q8_PrefixToInfix {
    public static void main(String[] args) {
        String prif="*+ab-cd";
        Stack<String> st=new Stack<>();
        for(int i=prif.length()-1;i>=0;i--){
            if(prif.charAt(i) == '+' || prif.charAt(i) == '-' ||
                    prif.charAt(i) == '*' || prif.charAt(i) == '/'){
                String left=st.peek();
                st.pop();
                String right=st.peek();
                st.pop();
                String newS="("+left+prif.charAt(i)+right+")";
                st.push(newS);
            }
            else{
                st.push(String.valueOf(prif.charAt(i)));
            }
        }
        System.out.println(st.peek());
    }
}
