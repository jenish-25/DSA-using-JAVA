package functions;
import java.util.Scanner;


public class powerOfNum {
     public static void PowerBase(int base, int power){
            int result=1;
            for(int i=1;i<=power;i++){
                result=result*base;
            }
            System.out.println(result);
        }
        public static void main(String args[]){
            int base,power;

            Scanner sc=new Scanner(System.in);
            System.out.println("enter ur num");
            base=sc.nextInt();
            System.out.println("enter ur power");
            power=sc.nextInt();
            PowerBase(base, power);
        }
    }