package functions;
import java.util.*;

public class average {
     public static void sum(int a,int b,int c){
            int sum=(a+b+c)/3;
            System.out.println(sum);
        }
        public static void main(String args[]){
            int a,b,c;

            Scanner sc=new Scanner(System.in);
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();

            sum(a,b,c);
        }
    }
