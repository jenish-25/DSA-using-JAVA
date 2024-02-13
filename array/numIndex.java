package array;
import java.util.Scanner;


public class numIndex {

        public static void main(String args[]){

            Scanner sc=new Scanner(System.in);
            System.out.println("enter ur array size ");
            int size = sc.nextInt();
            int number[] = new int[size];
            System.out.println("enter ur array");
            for(int i=0;i<size;i++){
                number[i]=sc.nextInt();
            }
            System.out.println("enter ur num to find that index ");

            int x=sc.nextInt();

            for(int i=0;i<number.length;i++){
                if(number[i]==x){
                    System.out.println("ur index is "+ i);
                }
            }
    }

}
