package stack;

import java.sql.SQLOutput;

public class basics {
    public static void main(String[] args) {
        int[] stack=new int[5];
        int top=-1;
        top=push(stack,top,10);
        top=push(stack,top,20);
        top=push(stack,top,30);
        prints(stack,top);
        top=pop(stack,top);
        prints(stack,top);
        System.out.println("isEmpty : " + isEmpty(top));
        System.out.println("peek is : " + peek(stack,top));
        System.out.println("size is : " + size(top));
    }

    private static void prints(int[] stack, int top) {
        while(top>=0){
            System.out.print(stack[top]+" ");
            top--;
        }
    }
    private static int size(int top)
    {
        return top+1;
    }
    private static int peek(int[] stack,int top){
        if(isEmpty(top)){
            System.out.println("stack is empty");
            return -1;
        }
        return stack[top];
    }
    private static boolean isEmpty(int top) {
        if(top== -1){
            return true;
        }
        return false;
    }
    private static int pop(int[] stack,int top){
        if(top == -1){
            System.out.println("stack is empty");
            return top;
        }
        System.out.println("popped value is " + stack[top]);
        top--;
        return top;
    }
    private static int push(int[] stack,int top,int value){
        if(top== stack.length-1){
            System.out.println("stack is overflow");
            return top;
        }
        top++;
        stack[top]=value;
        return top;
    }
}
