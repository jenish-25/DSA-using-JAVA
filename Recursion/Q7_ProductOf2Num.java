package Recursion;

public class Q7_ProductOf2Num {
    public static void main(String[] args) {
        int x=5;
        int y=12;
        System.out.println(product(x,y));
    }
    private static int product(int x, int y) {
       if(x>0 && y<0){
           return product(y,x);
       }
       else if(x<0 && y<0){
           return product((-1*x),(-1*y));
       }
       if(x>y){
           return product(y,x);
       }
       else if(y!=0){
           return x+ product(x,y-1);
       }
       else return 0;
    }
}
