package condition;

public class gdg1 {
        public static void main(String args[]){
            int x=52,y=24,gcd=1;
            for(int i=1;i<=x && i<=y;i++){
                if(x%i==0 && y%i==0){
                    gcd=i;
                }
            }
            System.out.println(gcd);
        }
    }
