package patterns;

public class ARowsTriangle {
    public static void main(String[] args) {              // A
        int n=5;                                          // B B
        for(int i=0;i<n;i++){                             // C C C
            char ch= (char) ('A'+i);                      // D D D D
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
