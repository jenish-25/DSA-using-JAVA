package functions;
import java.util.Scanner;
public class radius {
        public static void radius(int r){
            double circum=2*3.1428*r;
            System.out.println("your circumstances is "+ circum);
        }
        public static void main(String args[]){
            int r;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter ur radius");
            r=sc.nextInt();

            radius(r);
        }
    }