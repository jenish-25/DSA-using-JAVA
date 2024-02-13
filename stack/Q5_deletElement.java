package stack;

import java.util.Stack;

public class Q5_deletElement {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        for(int i=1;i<10;i++){
            s1.push(i);
        }
        int n=s1.size();
        int midd=0;
        if(n%2==0){
             midd=n/2;
        }
        else{
            midd=n/2+1;
        }
        for(int i=1;i<=midd;i++){
            if(i==midd){
                s1.pop();
                break;
            }
            s2.push(s1.pop());
        }
        for(int i=1;i<midd;i++){
            s1.push(s2.pop());
        }
        System.out.println(s1);
    }
}
