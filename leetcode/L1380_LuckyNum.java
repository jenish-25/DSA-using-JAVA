package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class L1380_LuckyNum {
    public static void main(String[] args) {
        int mat[][] = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};

        int max2=0,min2=Integer.MAX_VALUE;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i< mat.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<mat[0].length;j++){
                min=Math.min(min,mat[i][j]);
            }
//            arr.add(min);
             max2=Math.max(max2,min);
        }
        for(int i=0;i<mat[0].length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j< mat.length;j++){
                max=Math.max(max,mat[j][i]);
            }
            min2=Math.min(min2,max);
        }
        System.out.println(min2+" "+max2);

    }
}
