package DAY26;

import java.util.Arrays;

public class MinimumPathSum {

    public static int[][] dp;
    
    public int f(int[][] grid, int m, int n){
        if(m==0 && n==0) return grid[0][0];
        if(m<0 || n<0) return Integer.MAX_VALUE-201;
        
        if(dp[m][n] != -1) return dp[m][n];
        
        int left = grid[m][n] + f(grid, m, n-1);
        int up = grid[m][n] + f(grid, m-1,n);
        
        return dp[m][n] = Math.min(left,up);
        
    }
    
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        dp = new int[m][n];
        for(int[] row :dp){
            Arrays.fill(row, -1);
        }
        return f(grid, m-1,n-1);
    }
}
