package leetcode;

public class L240_Search2Dmatrix2 {
    public static void main(String[] args) {
      int[][] mat = {{1,4,7,11,15},
                     {2,5,8,12,19},
                     {3,6,9,16,22},
                     {10,13,14,17,24},
                     {18,21,23,26,30}};
      int target = 12;
      int r=mat.length-1;
      int c=0;
      while(r<mat.length && c<mat[0].length){
          if(mat[r][c]==target){
              System.out.println("true");
              return;
          }
          else if(r!=0 && mat[r][c]>target){
              r--;
          }
          else c++;
      }
        System.out.println("false");
    }
}
