package matrix;

public class Q18_minimumSumPath {
    public static void main(String[] args) {
        int mat[][]={{4,5,2,3},
                     {7,0,2,13},
                     {9,5,14,1},
                     {6,4,2,0}};
        int row=mat.length;
        int col=mat[0].length;
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(r==0 && c==0){
                    continue;
                }
                else if(r==0){
                    mat[r][c]=mat[r][c]+mat[r][c-1];
                }
                else if(c==0){
                    mat[r][c]=mat[r][c]+mat[r-1][c];
                }
                else {
                    mat[r][c]=mat[r][c]+Math.min(mat[r-1][c],mat[r][c-1]);
                }
            }
        }
        System.out.println(mat[row-1][col-1]);
    }
}
