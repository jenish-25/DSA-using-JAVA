package matrix;

import java.util.Arrays;

public class Q17_searchinRowAndCol {
    public static void main(String[] args) {       //   O(log(r + c))==>log(n)
        int mat[][]={{10,20,30,40},
                     {16,25,36,42},
                     {17,28,49,50}};
        int ans[]=new int[2];

        int start=0;
        int end= mat[0].length-1;

        int target=25;

        while(start>=0 && start< mat.length && end>=0 && end<mat[0].length){
             if(mat[start][end]==target){
                 ans[0]=start;
                 ans[1]=end;
                 System.out.println(Arrays.toString(ans));
                 return;
             }
             else if(mat[start][end]>target){
                 end--;
             }
             else start++;
         }
        System.out.println("not present");
    }
}
