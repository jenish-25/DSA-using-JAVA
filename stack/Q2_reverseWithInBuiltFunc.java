package stack;

import java.util.Stack;

public class Q2_reverseWithInBuiltFunc {
    public static void main(String[] args) {
        String s="olleh avaj gnimmargorp";
        Stack<Character> st=new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                while(!st.isEmpty()){
                    System.out.print(st.pop()+"");
                }
                System.out.print(" ");
            }
            else{
                st.push(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
            System.out.print(st.pop()+"");
        }
    }
}
