package leetcode;

import java.util.Stack;

public class L946_validateStackSequence {
    public static void main(String[] args) {
       int[] pushed = {1,2,3,4,5}, popped = {4,5,3,2,1};
        Stack<Integer> st=new Stack<>();
        int i=0,j=0;
        st.push(-1);
        while(!st.isEmpty()){
            if(popped[j]==pushed[i]){
                st.push(pushed[i]);
                i++;
            }
            st.push(pushed[i]);
            i++;

        }
    }
}
