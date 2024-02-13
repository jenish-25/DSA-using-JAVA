package leetcode;

public class L191_numOfSetBits {
    public static void main(String[] args) {
       int n = 00000000000000000000000000001011;
        int count=0;
        while(n != 0){
            n= n & (n-1);
            count++;
        }
        System.out.println(count);
}
}
