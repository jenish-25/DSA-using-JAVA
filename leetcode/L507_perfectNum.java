package leetcode;

public class L507_perfectNum {
    public static void main(String[] args) {
        int num=28;
        int sum = 1;
        if(num==1) {
            System.out.println("false");
            return;
        }
        for(int i=2; i*i<=num; i++) {
            if(num%i==0) {
                sum += i + num/i;
            }
        }
        if(sum==num) {
            System.out.println("true");
            return;
        }
        System.out.println("false");
    }
}
