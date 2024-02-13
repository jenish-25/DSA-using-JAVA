package matrix;

public class Q10_highSumCol {
    public static void main(String[] args) {
        int mat[][]={{4,10,1},
                     {7,1,3},
                     {3,5,2}};
        int max=0;
        for(int i=0;i< mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[0].length;j++){
                sum+=mat[j][i];
            }
            max=Math.max(max,sum);
        }
        System.out.println(max);

    }
}
