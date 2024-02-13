package leetcode;

import java.util.Arrays;

public class L1304_UniqueAddUpto0 {
    public static void main(String[] args) {
        int n=4;
        int d=-(n/2);
        int[] ans=new int[n];
        if(n%2 != 0){
            for(int i=0;i<n;i++){
                ans[i]=d;
                d=d+1;
            }
        }
        else{
            for(int i=0;i<n;i++){
                if(d==0){
                    d=d+1;
                }
                ans[i]=d;
                d=d+1;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
