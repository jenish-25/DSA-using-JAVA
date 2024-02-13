package leetcode;

import java.util.Arrays;

public class L832_flipingAnImage {
    public static void main(String[] args) {
       int[][] image = {{1,1,0},{1,0,1},{0,0,0}};

       int row=image.length;
       int col=image[0].length;
       for(int i=0;i<row;i++){
           int start=0;
           int end=image[0].length-1;
           while(start<end){
               int temp=image[i][start];
               image[i][start]=image[i][end];
               image[i][end]=temp;
               start++;
               end--;
           }
       }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(image[i][j]==1){
//                    System.out.print(0+" ");
                 image[i][j]=0;
                }
                else{
//                    System.out.print(1+" ");
                 image[i][j]=1;
                }
//                image[i][j]^=image[i][j];

            }
        }
        System.out.println(Arrays.deepToString(image));

    }
}
