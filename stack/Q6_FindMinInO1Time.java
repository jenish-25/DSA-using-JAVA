package stack;

import java.util.Stack;

public class Q6_FindMinInO1Time {
    static Stack<Integer> st=new Stack<>();
    static Stack<Integer> MinSt=new Stack<>();

    public static void main(String[] args) {
        push(10);
        pop();
        push(3);
        System.out.println(getMin());
        pop();
        push(7);
//        System.out.println(getMin());

    }
    private static int getMin() {
        return MinSt.peek();
    }
    private static void pop() {
        if(MinSt.peek()== st.peek()){
            MinSt.pop();
        }
        st.pop();
    }
    private static void push(int value) {
      if(MinSt.isEmpty() ){
          MinSt.push(value);
      }
      else if(MinSt.peek() >= value){
          MinSt.push(value);
      }
      st.push(value);
    }
}
