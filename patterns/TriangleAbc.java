package patterns;

public class TriangleAbc {
    public static void main(String[] args) {       //E
        int n=5;                                   //DE
        for(int i=0;i<=n;i++){                      //CDE
            char ch = (char) ('A'+n-i);            //BCDE
            for(int j=0;j<=i;j++){                 //ABCDE
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
