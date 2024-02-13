package condition;

public class PrimeOrNot {
        public static void main(String args[]){
            // int num=29,count=0;
            // for(int i=1 ;i<=num;i++){
            //     if(num%i==0){
            //         count++;
            //     }
            // }
            // if(count==2){
            //     System.out.println("prime");
            // }
            // else{
            //     System.out.println("not prime");
            // }

            //other example

//            int n=17;
//            for(int i=2;i<n;i++){
//                if(n%i==0){
//                    System.out.println("not prime");
//                    return;
//                }
//            }
//            System.out.println(n +" prime");

            // other example==>

            int num = 29;
            boolean flag = false;
            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }
    }
