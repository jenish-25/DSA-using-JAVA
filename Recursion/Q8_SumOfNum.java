package Recursion;

public class Q8_SumOfNum {
    public static void main(String[] args) {
        int n=61;
        System.out.println(sumNum(n));
    }
    private static int sumNum(int n) {
        if(n==0) {
            return 0;
        }
        return n%10 + sumNum(n/10);
    }
}
