package condition;
import java.util.*;

public class sumOfOdd {
     public static void sumOdd(int n){
            int sum=0;
            for(int i=1;i<=n;i++){
                if(i%2==1){
                    sum=sum+i;
                }
            }
            System.out.println(sum);
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter ur num ");
            int n=sc.nextInt();
            sumOdd(n);
        }
    }
