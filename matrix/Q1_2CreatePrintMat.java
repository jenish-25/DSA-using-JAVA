package matrix;

import java.util.Arrays;
import java.util.Scanner;
public class Q1_2CreatePrintMat {
    public static void main(String[] args) {
        int matrix[][];
        int row,col;
        Scanner sc=new Scanner(System.in);

        // create matrix==> :

        System.out.println("number of rows");
        row=sc.nextInt();
        System.out.println("number of columns");
        col=sc.nextInt();
        matrix=new int[row][col];

        System.out.println("enter the data ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //print matrix==> :

        System.out.println("the matrix is");
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                System.out.print("\t" + matrix[i][j]);
//            }
//            System.out.println();
//        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
