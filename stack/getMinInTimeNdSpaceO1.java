package stack;

import java.util.Stack;

public class getMinInTimeNdSpaceO1 {               // time : O(1)
                                                   // space : O(1)
    Integer minEle;
    Stack<Integer> st;
    getMinInTimeNdSpaceO1(){
        st=new Stack<>();
    }
    int getmin(){
        if(st.isEmpty()){
            return -1;
        }
        return minEle;
    }
    void push(int x){
        if(st.size()==0){
            st.push(x);
            minEle=x;
        }
        else{
            if(x>=minEle){
                st.push(x);
            }
            else if(x<minEle){
                st.push(2*x-minEle);
                minEle=x;
            }
        }
    }
    void pop(){
        if(st.size()==0){
            System.out.println("empty");
            return;
        }
        else{
            if(st.peek()>=minEle){
                st.pop();
            }
            else if(st.peek()<minEle){
                minEle=2*minEle-st.peek();
                st.pop();
            }
        }
    }
    int top(){
        if(st.size()==0){
            return -1;
        }
        else{
            if(st.peek()>=minEle){
                return st.peek();
            }
            else if(st.peek()<minEle){
                return minEle;
            }
        }
        return minEle;
    }
    public static void main(String[] args) {
        getMinInTimeNdSpaceO1 s=new getMinInTimeNdSpaceO1();
        s.push(5);
        s.push(3);
        s.push(1);
        System.out.println(s.getmin());
        s.pop();
        s.push(7);
        System.out.println(s.getmin());
    }
}
