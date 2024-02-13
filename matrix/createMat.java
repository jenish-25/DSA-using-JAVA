package matrix;

public class createMat {
    public static void main(String[] args) {
        int[][] matrix=new int[3][4];
        for(int i=0;i< matrix.length;i++){
            System.out.print("row " + i +" : ");
            for(int j=0;j< matrix.length;j++){
                System.out.print("col " + j + "  ");
            }
            System.out.println();
        }
    }
}
