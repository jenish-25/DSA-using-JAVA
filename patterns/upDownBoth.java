package patterns;
    /*  *        *
        **      **
        ***    ***
        ****  ****
        **********
        ****  ****
        ***    ***
        **      **
        *        *   */

public class upDownBoth {
    public static void main(String[] args) {
        int n=5;
        int space=2*n-2;
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            stars= i>n ? 2*n-i : i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }

            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n){
                space-=2;
            }
            else{
                space+=2;
            }
        }
    }
}
