package condition;
import java.util.*;


public class factorial {
        public static void main(String args[]){
            int fact=1;
            long num;
            try (Scanner jems = new Scanner(System.in)) {
                System.out.println("enter ur num ");
                num=jems.nextLong();
            }
            for(int i=1;i<=num;i++){
                fact=fact*i;
            }
            System.out.println("factorial of "+ num + " is " + fact);
        }
    }


