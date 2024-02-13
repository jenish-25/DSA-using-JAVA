package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class L856_scoreOfParanthases {
    public static void main(String[] args) {
     String s ="(()(()))";                  //6
        Deque<Integer> q=new ArrayDeque<>();
       int count=0;
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(c =='('){
                q.addFirst(count);
                count=0;
            }
            else{
                int popped=q.removeFirst();
                if(s.charAt(i-1)=='('){
                    popped++;
                }
                else {popped+=count*2;}
                count=popped;
            }
        }
        System.out.println(count);
    }
}
