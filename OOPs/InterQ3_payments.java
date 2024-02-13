package OOPs;

import java.util.Scanner;

public class InterQ3_payments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        creditCard cc=new creditCard();
        paypal p=new paypal();
        bitcoin b=new bitcoin();
        System.out.println("which method do you want to pay..");
        System.out.println("credit card[1] , paypal[2] , bitcoin[3] ");
        int ops=sc.nextInt();
        System.out.println("enter the payment amt");
        double amount=sc.nextDouble();
        sc.nextLine();
        switch (ops){
            case 1:
                cc.displayAmount(amount);
                break;
            case 2:
                p.displayAmount(amount);
                break;
            case 3:
                b.displayAmount(amount);
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        sc.close();
    }
}
interface strategyPattern{
    Scanner sc=new Scanner(System.in);
    void displayAmount(double amt);
}
class creditCard implements strategyPattern{
    @Override
    public void displayAmount(double amt) {
        System.out.println("-------------------------------------------");
        System.out.println("entor your credit card num");
        int credit=sc.nextInt();
        System.out.println("enter cvv");
        int cvv=sc.nextInt();
        sc.nextLine();
        System.out.println(amt + " rps successfully transfered by " + credit);
    }
}
class paypal implements strategyPattern{
    @Override
    public void displayAmount(double amt) {
        System.out.println("-------------------------------------------");
        System.out.println("entor your paypal id num");
        int email=sc.nextInt();
        System.out.println("enter password");
        int pass=sc.nextInt();
        sc.nextLine();
        System.out.println(amt + " rps successfully transfered by " + email);
    }
}
class bitcoin implements strategyPattern{
    @Override
    public void displayAmount(double amt) {
        System.out.println("-------------------------------------------");
        System.out.println("entor your bitcoin wallet address num");
        int wallet=sc.nextInt();
        sc.nextLine();
        System.out.println(amt + " rps successfully transfered by " + wallet);
    }
}
