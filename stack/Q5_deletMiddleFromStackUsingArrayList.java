package stack;

import java.util.ArrayList;
import java.util.Stack;

public class Q5_deletMiddleFromStackUsingArrayList {
    public static void main(String[] args) {
        Stack<Character> st=new Stack<>();
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');
        st.push('5');
        st.push('6');
        st.push('7');
        ArrayList<Character> list=new ArrayList<>();

        while(!st.empty()){
            list.add(st.pop());
        }
        int n=list.size();
        if(n%2==0){
            int target=(n/2);
            for(int i=0;i<n;i++){
                if(i==target)continue;
                st.push(list.get(i));
            }
        }
        else{
            int target=(int)Math.ceil(n/2);
            for(int i=0;i<n;i++){
                if(i==target)continue;
                st.push(list.get(i));
            }
        }
        while (!st.empty()){
            char p=st.pop();
            System.out.print(p + " ");
        }
    }
}
