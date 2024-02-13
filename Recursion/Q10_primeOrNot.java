package Recursion;

public class Q10_primeOrNot {
    public static void main(String[] args) {
//        int n=10;
        int n=47;
//        int n=2;
//        int n=11;
        if(isPrime(n,2)){
            System.out.println(true);
        }
        else System.out.println(false);
    }

    private static boolean isPrime(int n, int i) {
        if(n<=2){
            return (n==2) ? true: false;
        }
        if(n%i==0){
            return false;
        }
        if(i*i >n){
            return true;
        }
        return isPrime(n,i+1);
    }
}
