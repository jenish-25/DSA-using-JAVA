package leetcode;

public class L202_happyNum {
    public static void main(String[] args) {
        int n=19;
        int sum=0;
        if(n==1){
            System.out.println("false");
            return;
        }
        else if(n<10){
            System.out.println("false");
            return;
        }
       while(n>9){
           while(n!=0){
               int digit=n%10;
               sum+=digit*digit;
               n/=10;
           }
           return;
       }
        n=sum;

    }
}
