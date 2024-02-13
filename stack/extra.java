package stack;

import java.util.Stack;

public class extra {
    public static void main(String[] args) {
        String s="(()())(())";
        String ans="";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push(s.charAt(i));
                if(stack.size()>1)
                {
                    ans=ans+s.charAt(i);
                }
            }
            else
            {
                stack.pop();
                if(stack.size()>=1)
                {
                    ans=ans+s.charAt(i);
                }
            }
        }
        System.out.println(ans);
    }
}
