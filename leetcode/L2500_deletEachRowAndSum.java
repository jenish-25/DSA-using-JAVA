package leetcode;

import java.util.Arrays;

public class L2500_deletEachRowAndSum {
    public static void main(String[] args) {
        int grid[][]={{1,2,4},
                      {3,3,1}};
        int row=grid.length;
        int col=grid[0].length;

        for(int i=0;i<row;i++){
            Arrays.sort(grid[i]);
        }
            int cost=0;
            for(int j=0;j<col;j++){
               int max=0;
               for(int k=0;k<row;k++){
                   if(grid[k][j]>max){
                       max=grid[k][j];
                   }
               }
            cost=cost+max;
            }
            System.out.println(cost);
    }
}
