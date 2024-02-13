package matrix;
public class Q9_highSumRows {
    public static void main(String[] args) {
        int mat[][]={{4,2,1},{7,1,3},{3,5,2}};
        int max=0;
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[0].length;j++){
                sum+=mat[i][j];
            }
            max=Math.max(sum,max);
        }
        System.out.println(max);
    }
}
