package condition;

public class gdg3 {
        public static void main(String args[]){
            int n1=6,n2=10;
            int temp;
            int gcd=0;

            while(n2>0){
                temp = n2;
                n2 = n1%n2;
                n1 = temp;
            }
            gcd=n1;
            System.out.println(gcd);
        }
    }
