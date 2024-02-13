package matrix;

public class Q5_MatInReverse {
    public static void main(String[] args) {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        int row= mat.length;;
        int col=mat[0].length;
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
