package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> q=new ArrayDeque<>();
        q.addFirst(5);
        q.addFirst(6);
        q.add(25);
        q.offerFirst(23);
        q.push(54);
        System.out.println(q.getFirst());
        System.out.println(q.getLast());
        System.out.println(q.pop());
    }
}
