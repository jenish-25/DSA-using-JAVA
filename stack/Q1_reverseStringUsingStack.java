package stack;

public class Q1_reverseStringUsingStack {
    public static void main(String[] args) {
        String s="hello";
        char[] stack=new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++){
            top=push(stack,top,s.charAt(i));
        }
        while(isempty(top)){
            top=pop(stack,top);
        }
        show(stack,top);
    }
    private static void show(char[] stack, int top) {
        while(top>=0){
            System.out.print(stack[top]+"");
            top--;
        }
    }
    private static int pop(char[] stack, int top) {
        if(top== -1){
            System.out.println("stack is empty");
            return top;
        }
        System.out.println(stack[top]);
        top--;
        return top;
    }
    private static int push(char[] stack, int top, char value) {
        if(top== stack.length-1){
            System.out.println("stack is overflow");
            return top;
        }
        top++;
        stack[top]=value;
        return top;
    }
    private static boolean isempty(int top) {
        if(top==-1){
            return true;
        }
        return false;
    }
}
