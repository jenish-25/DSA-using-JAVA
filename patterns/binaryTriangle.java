package patterns;

public class binaryTriangle {                                  // 1
    public static void main(String[] args) {                   // 0 1
        int n=5;                                               // 1 0 1
        for(int  i=0;i<n;i++){                                 // 0 1 0 1
            int start=1;                                       // 1 0 1 0 1
            start= i%2==0 ? 1 : 0;
            for (int j=0;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
}
