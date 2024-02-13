package queue;

import java.util.Queue;
import java.util.Stack;

public class Q4_QueueUsing2Stacks {
    static class queue{
        static Stack<Integer> st=new Stack<>();
        static Stack<Integer> st2=new Stack<>();

        public static boolean isEmpty(){
            return st.isEmpty();
        }

//        public static void add(int value){  //tc(n)
//           while(!st.isEmpty()){
//                st2.push(st.pop());
//            }
//            st.push(value);
//            while(!st2.isEmpty()){
//                st.push(st2.pop());
//            }
//        }

//        public static int remove(){     //tc(1)
//            return st.pop();
//        }

//        public static int peek(){     //tc(1)
//            return st2.peek();
//        }

        public static void add(int value){     //tc(1)
               st.push(value);
        }
        public static int remove(){     //tc(n)
           while(st.size()!=1){
                st2.push(st.pop());
            }
            int x=st.pop();
            while(st2.size()!=0){
                st.push(st2.pop());
            }
            return x;
        }
        public static int peek(){     //tc(n)
            while(st.size()!=1){
                st2.push(st.pop());
            }
            int x=st.peek();
            while(st2.size()!=0){
                st.push(st2.pop());
            }
            return x;
        }
    }
    public static void main(String[] args) {
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
