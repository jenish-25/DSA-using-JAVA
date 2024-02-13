package Recursion;

public class Q11_fibonacci {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){
            System.out.print(fibo(i)+" ");
        }
    }
    private static int fibo(int n) {
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
