package leetcode;

import java.util.Arrays;

public class L2373_LargestLocalValuesInMatrix {
    public static void main(String[] args) {
        int mat[][]={{1,1,1,1,1},{1,1,1,1,1},{1,1,2,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        int n= mat.length;
        int ans[][]=new int[n-2][n-2];

        for(int a = 0; a < n-2; a++){
            int[] first = mat[a];
            int[] second = mat[a+1];
            int[] third = mat[a+2];
            for(int b = 0; b < n-2; b++){
                    int max = 0;
                for(int c  = b; c < b+3; c++){
                    max = Math.max(max, first[c]);
                }
                for(int d = b; d < b+3; d++){
                    max = Math.max(max, second[d]);
                }
                for(int e = b; e < b+3; e++){
                    max = Math.max(max, third[e]);
                }
                ans[a][b] = max;
            }
        }
        System.out.println(Arrays.deepToString(ans));
    }
}
