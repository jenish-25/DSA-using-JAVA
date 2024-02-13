package patterns;

public class UnumTriangle {                            // 1 2 3 4
    public static void main(String[] args) {           // 1 2 3
        int n=5;                                       // 1 2
        for(int i=1;i<=n;i++){                         // 1
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
