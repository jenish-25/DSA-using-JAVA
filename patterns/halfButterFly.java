package patterns;

public class halfButterFly {                        //1______1
    public static void main(String[] args) {        //12____21
        int n=4;                                    //123__321
        for(int i=1;i<=n;i++){                      //12344321
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=0;j<2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
