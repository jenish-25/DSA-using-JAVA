package matrix;

public class Q4_SumOfMat {
    public static void main(String[] args) {
        int mat[][]={{1,2,3},{4,5,6},{7,8,10}};
        int row= mat.length;
        int sum=0;
        int col=mat[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum+=mat[i][j];
            }
        }
        System.out.println(sum);
    }
}
