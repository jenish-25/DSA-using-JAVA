package patterns;

public class SquareNto1 {
    public static void main(String[] args) {                  //4444444
        int n=4;                                              //4333334
        for(int i=0;i<2*n-1;i++){                             //4322234
            for(int j=0;j<2*n-1;j++){                        // 4321234
                int top=i;                                   // 4322234
                int left=j;
                int right=(2*n-2)-j;
                int bottom=(2*n-2)-i;
                System.out.print(n-Math.min(Math.min(top,bottom),Math.min(left,right))+" ");
            }
            System.out.println();
        }
    }
}
