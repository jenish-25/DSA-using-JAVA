package leetcode;

public class L172_trailingZeros {
    public static void main(String[] args) {
        int n=624;
        int result=0;
        if(n>=5) result += n/5;
        if(n>=25) result += n/25;
        if(n>=125) result += n/125;
        if(n>=625) result += n/625;
        if(n>=3125) result += n/3125;
        System.out.println(result);

    }
}
