package OOPs;

import java.util.Scanner;

public class Q2_account {
    public static void main(String[] args) {
        Account ac=new Account();
        ac.calculateInterest();
        ac.show();
    }
}
class Account{
    int accNum;
    String name;
    double balance;
   static double intRate=4.5;
    public void calculateInterest(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur account num");
        accNum=sc.nextInt();
        System.out.println("name = ");
        name=sc.next();

        System.out.println("balance ");
        balance=sc.nextInt();
        balance+=(balance*intRate)/100;
    }
    public void show(){
        System.out.println("account number is : "+ accNum);
        System.out.println("name is: "+name);
        System.out.println("your current balance is "+balance);
    }
}