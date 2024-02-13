package matrix;

public class Q13_DiagonalMat {
    public static void main(String[] args) {
        int mat[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        int row= mat.length;
        for(int i=0;i<row;i++){
            System.out.print(mat[i][i]+" ");
        }
    }
}
