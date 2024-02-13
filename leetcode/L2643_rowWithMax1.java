package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class L2643_rowWithMax1 {
    public static void main(String[] args) {
        int mat[][] = {{0,1},
                       {1,0},
                       {1,1}};
        int idx=0,max=0;
        int ans[]=new int[2];
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                max=count;
                idx=i;
            }
        }
        ans[0]=idx;
        ans[1]=max;
        System.out.println(Arrays.toString(ans));
    }
}
