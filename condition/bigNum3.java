package condition;

public class bigNum3 {
        public static void main(String args[]){
            int  a=7, b=7, c=4;
            if(a>b && a>c){
                System.out.println("a is big");
            }
            else if(b>c && b>a){
                System.out.println("b is big");
            }
            else if(c>a && c>b){
                System.out.println("c is big");
            }
            else if(a==b && a>c){
                System.out.println("a and b both are big");
            }
            else if(b==c && b>a){
                System.out.println("b nd c both are big");
            }
            else if(a==c && a>b){
                System.out.println("a and c both are big");
            }
            else{
                System.out.println("all three are equal");
            }
        }
    }

