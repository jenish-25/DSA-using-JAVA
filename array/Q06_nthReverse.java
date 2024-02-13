package array;
import java.util.Scanner;

public class Q06_nthReverse {

        public static void main(String args[]){
            int arr[]={1,2,3,4,5};

            Scanner sc=new Scanner(System.in);
            System.out.println("enter ur num ");
            int n=sc.nextInt();

            System.out.print(arr[arr.length-n]);


        }
    }
