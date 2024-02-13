package patterns;

public class AbcPiramid {
    public static void main(String[] args) {
        int n=5;                                       //      A
        for(int i=0;i<n;i++){                          //     ABA
            for(int j=0;j<n-i-1;j++){                  //    ABCBA
                System.out.print(" ");                 //   ABCDCBA
            }                                          //  ABCDEDCBA
            char ch='A';
            int i1 = (2 * i + 1) / 2;
            for(int j=1;j<=(2*i)+1;j++){
                System.out.print(ch);
                if(j<=i1){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
