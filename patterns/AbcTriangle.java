package patterns;

public class AbcTriangle {                                      // A
    public static void main(String[] args) {                    // A B
        int n=5;                                                // A B C
        for(int i=0;i<n;i++){                                   // A B C D
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
