package leetcode;

import java.util.Arrays;

public class L2614_PrimeInDiagonal {
    public static void main(String[] args) {
        int mat[][]={{11,2,3},{5,6,7},{9,10,1}};
        int ans[]=new int[mat.length*2];
        int j=0;
        int max=0;
        for(int i=0;i<mat.length;i++){
                ans[j]=mat[i][i];
                ans[j+mat.length]=mat[i][mat.length-i-1];
                j++;
        }
//        System.out.println(Arrays.toString(ans));
        for(int i=0;i< ans.length;i++){
            int count=0;
            for(int k=2;k<ans.length/2;k++){
                if(ans[i]%k==0){
                    count++;
                }
            }
            for(int z=0;z< ans.length;z++) {
                if (count == 0) {
                    max = Math.min(max, ans[i]);
                    System.out.println(max);
                }
            }
        }

//        System.out.println(Arrays.toString(ans));
    }
}
