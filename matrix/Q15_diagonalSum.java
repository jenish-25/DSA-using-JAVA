package matrix;

public class Q15_diagonalSum {
    public static void main(String[] args) {
        int mat[][]={{1,8,9,10,5},
                     {7,5,6,12,4},
                     {5,1,4,19,3},
                     {4,2,5,11,7},
                     {4,2,5,11,7}};

        int row= mat.length;
//        int col=mat[0].length;
        int sum=0;
        for(int i=0;i< mat.length;i++){
                sum+=mat[i][i];
                if(i!=row-i-1){
                    sum+=mat[i][row-i-1];
                }
            }
        System.out.print(sum+" ");
    }
}
