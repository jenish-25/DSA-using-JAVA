package stack;

import java.util.Stack;

public class Q3_palindromeString {
    public static void main(String[] args) {
        String s="mananam";
        Stack<Character> st=new Stack<>();
        int i=0;
        for(;i<s.length()/2;i++){
            st.push(s.charAt(i));
        }
        if(s.length()%2!=0){
            i++;
        }
        while(i<s.length()){
            char ele=st.pop();
            if(ele!=s.charAt(i)){
                System.out.println(false);
                return;
            }
            i++;
        }
        System.out.println(true);
    }
}
