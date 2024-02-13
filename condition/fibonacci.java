package condition;
import java.util.Scanner;

public class fibonacci {

        public static void main(String args[]){
            int n1=0,n2=1,n3,term;

            Scanner r=new Scanner(System.in);

            System.out.println("enter ur num");
            term = r.nextInt();

            System.out.print(n1 + " " + n2+ " " );

            for(int i=2; i<term ;i++){
                n3=n1+n2;
                System.out.print(n3+ " ");
                n1=n2;
                n2=n3;
            }

            //in other method

            // int n=10;
            // int n1=0,n2=1;
            // System.out.print(n1 + " " + n2 +" ");
            // while(n>2){
            //     int sum=n1+n2;
            //     n1=n2;
            //     n2=sum;
            //     System.out.print(" "+n2);
            //     n--;
            // }
        }
    }

