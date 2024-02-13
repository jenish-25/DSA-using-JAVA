package matrix;

public class Q7_mirrorImage {
    public static void main(String[] args) {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9},{4,8,6}};
        int row= mat.length;
        int col=mat[0].length;
        for(int i=0;i<row;i++){
            for(int j=col-1;j>=0;j--){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
