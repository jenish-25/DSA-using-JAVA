package leetcode;

public class L231_powerOf2 {
    public static void main(String[] args) {
        int n=4;
        int ans=1;
//        int a=2;
        for(int i=0;i<30;i++){
            ans = (int)Math.pow(2,i);
            if(ans==n){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}
