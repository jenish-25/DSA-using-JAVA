package patterns;

public class UltuAbcTriangle {                          // A B C D
    public static void main(String[] args) {            // A B C
        int n=5;                                        // A B
        for(int i=0;i<n;i++){                           // A
            for(char ch='A';ch<='A'+n-i-1;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
