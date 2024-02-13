package Recursion;

public class basic {
  static int count=0;
    public static void main(String[] args) {
        int n=4;
//        countPri();
//        namePri(1,n);
//        Print1toN(1,n);
//        reverseNum(n,n);
//        System.out.println("sum of " + n + " is " + sumForNnum(n));
        System.out.println("fact of " + n + " is " + factForNnum(n));

    }
    public static void countPri(){
        if(count==10){
            System.out.println(count);
            return;
        }
        System.out.println(count);
        count++;
        countPri();
    }
    public static void namePri(int i,int n){
        if(i>n){return;}
        System.out.println("jenish");
        namePri(i+1,n);
    }
    public static void Print1toN(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        Print1toN(i+1,n);
    }
    public static void reverseNum(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        reverseNum(i-1,n);
    }
    public static int sumForNnum(int n){
        if(n==0){
            return 0;
        }
        return n + sumForNnum(n-1);
    }
    public static int factForNnum(int n){
        if(n==1){
            return 1;
        }
        return n * factForNnum(n-1);
    }
}
