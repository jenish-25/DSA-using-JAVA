package leetcode;

public class L461_hammingDistnace {
    public static void main(String[] args) {
       int x = 1, y = 4;
        int res=x ^ y;
        int count=0;
        while(res!=0){
            res &= res-1;
            count++;
        }
        System.out.println(count);
    }
}
