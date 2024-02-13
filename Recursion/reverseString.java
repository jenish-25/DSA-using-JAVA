package Recursion;

public class reverseString {
    public static void main(String[] args) {
        char[] s="hello".toCharArray();
        int n=s.length;
        int i=0;
        reverse(i,n,s);
    }
    public static void reverse(int i,int n,char[] s){
        if(i==n){
            return;
        }
        char temp=s[i];
        reverse(i+1,n,s);
        System.out.print(temp);
    }
}
