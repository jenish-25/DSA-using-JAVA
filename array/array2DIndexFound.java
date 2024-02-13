package array;
import java.util.Scanner;


public class array2DIndexFound {

        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter row size");
            int row=sc.nextInt();
            System.out.println("enter col size");
            int col=sc.nextInt();
            int num[][]=new int[row][col];
            System.out.println("enter ur array");


            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    num[i][j]=sc.nextInt();
                }
            }
            System.out.println("enter ur num to find index");
            int x=sc.nextInt();

            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(num[i][j]==x){
                        System.out.println("( " + i + " , " + j + " )");
                    }
                }
            }

        }
    }
