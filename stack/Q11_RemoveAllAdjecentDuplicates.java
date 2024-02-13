package stack;

import java.util.Stack;

public class Q11_RemoveAllAdjecentDuplicates {
    public static void main(String[] args) {
        String s="abbaca";
        Stack<Character> st=new Stack<>();
       for(char ch : s.toCharArray()){
           if(!st.empty() && st.peek() == ch){
               st.pop();
           }
           else{
               st.push(ch);
           }
       }
       String ans="";
       while(!st.empty()){
           ans=st.pop()+ans;
       }
        System.out.println(ans);
    }
}
