package OOPs;

import java.util.Scanner;

public class InterQ1_prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        I2 i=new I2();
        System.out.println("enter ur num");
        int num=sc.nextInt();
        int count= i.display(num);
        System.out.println(count);
    }
}
interface I1{
    int display(int k);
}
class I2 implements I1{
    @Override
    public int display(int k) {
        int count=0;

        for(int i=2;i<k;i++){
            boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                count++;
            }
        }
        return count;
    }
}
