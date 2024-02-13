package patterns;

public class nOfRows {
    public static void main(String[] args) {        //1
        int n=5;                                    //2 3
        int num=1;                                  //4 5 6
                                                    //7 8 9 10
        for(int i=1;i<=n;i++){                      //11 12 13 14 15
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
