package functions;

public class calci {
        public static void main(String args[]){
            int total=0;
            int a=10;
            int b=5;
            total=addition(a,b);
            System.out.println("addition:       " + total);
            total=substraction(a,b);
            System.out.println("substraction:   " + total);
            total=multiplication(a,b);
            System.out.println("multiplication: " + total);
            total=division(a,b);
            System.out.println("division:       " + total);

        }
        private static int addition(int a,int b){
            int total=a+b;
            return total;
        }
        private static int substraction(int a,int b){
            int total=a-b;
            return total;
        }
        private static int multiplication(int a,int b){
            int total=a*b;
            return total;
        }
        private static int division(int a,int b){
            if(a>b){
                int total=a/b;
                return total;
            }
            else{
                System.out.println("add valid info");
            }
            return 0;
        }
        // private static void print(int total){
        //     System.out.println(total);
        // }
    }
