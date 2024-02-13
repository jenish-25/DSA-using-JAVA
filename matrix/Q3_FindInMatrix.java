package matrix;

import java.util.Scanner;

public class Q3_FindInMatrix {
    public static void main(String[] args) {
        int matrix[][];
        int row,col;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row num");
        row=sc.nextInt();
        System.out.println("enter col num");
        col=sc.nextInt();
        matrix=new int[row][col];
        System.out.println("enter your data");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the value to find");
        int value=sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++) {
                if (matrix[i][j] == value) {
                    System.out.println("present");
                    return;
                }
            }
        }
        System.out.println("not present");
    }
}
