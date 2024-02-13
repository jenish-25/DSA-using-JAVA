package leetcode;

public class L2319_XmatrixChecked {
    public static void main(String[] args) {
       int[][] grid = {{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                if(i == j || i == (grid.length-j-1))
                {
                    if(grid[i][j] == 0)
                    System.out.println("false");
                    return;
                }
                else if(grid[i][j] != 0)
//                    return false;
                    System.out.println("false");
                return;
            }
        }

//        return true;
        System.out.println("true");
    }
}
