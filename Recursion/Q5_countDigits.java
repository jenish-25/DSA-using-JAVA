package Recursion;

public class Q5_countDigits {
    public static void main(String[] args) {
        int n=12355;
        System.out.println(countDigit(n));
    }
    public static int countDigit(int n){
        if(n==0){
            return 0;
        }
        return 1 + countDigit(n/10);
    }
}
