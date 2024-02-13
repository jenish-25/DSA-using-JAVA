package leetcode;

public class L2544AlternateDigitSum {
    public static void main(String[] args) {
        int n=521;
        int  count=0;
        int sum=0;
        int temp=n;
        while(n!=0){
            n/=10;
            count++;
        }

        for(int i=0;i<count;i+=2){
            if(i%2==0){
                sum-=temp;
            }
        }
        for(int i=1;i<count;i+=2){
            if(i%2!=0){
                sum+=temp;
            }
        }
    }
}
