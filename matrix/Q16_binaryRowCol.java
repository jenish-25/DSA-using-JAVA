package matrix;

import java.util.Arrays;

public class Q16_binaryRowCol {                //O(log r + log c)
    public static void main(String[] args) {
        int mat[][]={{-41,-33,-14,-5,7},
                     {8,9,10,12,14},
                     {15,16,17,19,20}};
        int v=-5;
        int row= mat.length;
        int col=mat[0].length;
        int ans[]=new int[2];

        int top=0,bottom=row-1;

        int RowToBeSearch=-1;
        while(top<=bottom){
            int mid=top+(bottom-top)/2;
            if(mat[mid][0]<=v && mat[mid][col-1]>=v){
                RowToBeSearch =mid;
                break;
            }
            else if(v> mat[mid][col-1]){
                top=mid+1;
            }
            else{
                bottom=mid-1;
            }
        }
        if(RowToBeSearch==-1){
            System.out.println("not present");
            return;
        }
        int left=0,right=col-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(v == mat[RowToBeSearch][mid]){
                ans[0]=RowToBeSearch;
                ans[1]=mid;
                System.out.println(Arrays.toString(ans));
                return;
            }
            else if(v < mat[RowToBeSearch][mid]){
                right=mid-1;
            }
            else {
                left=mid+1;
            }

        }
        System.out.println("not present");
    }
}
