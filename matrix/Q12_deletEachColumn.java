package matrix;

public class Q12_deletEachColumn{
    public static void main(String[] args) {
        int mat[][]={{1,8,9,10},
                     {7,5,6,12},
                     {5,1,4,9},
                     {4,2,5,11}};

        int row= mat.length;
        int col=mat[0].length;
        for(int i=0;i<col;i++){
            int max=mat[0][i];
            int idx=0;
            for(int j=0;j<row;j++){
                if(mat[j][i]>max){
                    max=mat[j][i];
                    idx=j;
                }
            }
            while(idx<row-1){
                mat[idx][i]=mat[idx+1][i];
                idx++;
            }
        }
        for(int i=0;i<row-1;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
