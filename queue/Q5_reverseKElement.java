package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q5_reverseKElement {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        int k=3;

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        int lastEle=q.size()-k;
        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        for (int i = 0; i < lastEle; i++) {
            q.add(q.remove());
        }
        System.out.println(q);
    }
}
