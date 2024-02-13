package queue;
import java.util.*;

public class Q6_QueueUsingFramework {
    public static void main(String[] args) {
//        Queue<Integer> q=new LinkedList<>();          //tc--> O(1)
        Queue<Integer> q=new ArrayDeque<>();            //tc--> O(1)
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.add(59);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
