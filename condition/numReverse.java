package condition;

public class numReverse {
        public static void main(String args[]){
            int n=15342364;
            int ans=0;
            while(n!=0){
                int reminder=n%10;
                if((ans>Integer.MAX_VALUE/10)||(ans<Integer.MIN_VALUE/10)){
                    System.out.println(0);
                    return;

                }
                ans=(ans*10)+reminder;
                n/=10;
            }
            System.out.println(ans);
        }
    }