package Recursion;

public class Q6_reverseIntegerNum {
    static int ans=0;

    public static void main(String[] args) {
        int n=12345;
        System.out.println(reverseInteger(n));
    }
    public static int reverseInteger(int n){
        if(n==0){
            return ans;
        }
        if(n>0){
            int rem=n%10;
            ans=(ans*10)+rem;
            reverseInteger(n/10);
        }
        return ans;
    }
}
