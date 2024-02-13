package functions;

public class atm {
        public static void main(String[] args) {
            int balance=0;
            balance= deposit(balance,5000);
            print(balance);
            balance= withdraw(balance,2000);
            print(balance);
        }
        private static int deposit(int b,int amt){
            b=b+amt;
            return b;
        }
        private static int withdraw(int b,int amt){
            b=b-amt;
            return b;
        }
        private static void print(int b){
            System.out.println(b);
        }
    }
