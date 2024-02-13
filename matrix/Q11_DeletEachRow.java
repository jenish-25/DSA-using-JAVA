package matrix;

public class Q11_DeletEachRow {
    public static void main(String[] args) {
        int mat[][]={{1,8,9},
                     {7,5,6},
                     {3,1,4}};

        int row= mat.length;
        int col=mat[0].length;

        for(int i=0;i<row;i++){
            int max=mat[i][0];
            int idx=0;
            for(int j=0;j<col;j++){
                if(mat[i][j]>max){
                    max=mat[i][j];
                    idx=j;
                }
            }
            while(idx<col-1){
                mat[i][idx]=mat[i][idx+1];
                idx++;
            }
        }
        //print mat==>:
        for(int i=0;i<row;i++){
            for(int j=0;j<col-1;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
