package DAY28;

public class MinimumFallingPathSum {
    
        public static int[][] dp;
        
        public int minFallingPathSum(int[][] matrix) {
            int row = matrix.length;
            int col = matrix[0].length;
            
            dp = new int[row][col];
                  
            for(int i=0;i<col;i++){
                dp[0][i] = matrix[0][i];
                
            }
            
            for(int i=1;i<row;i++){
                for(int j=0;j<col;j++){
                    int up = matrix[i][j] + dp[i-1][j];
                    
                    int ld = matrix[i][j];
                    if(j>0){
                        ld += dp[i-1][j-1];
                    }else{
                        ld += (int)1e9;
                    }
                    
                     int rd = matrix[i][j];
                    if(j+1<col){
                        rd +=  dp[i-1][j+1];
                    }else{
                        rd += (int)1e9;
                    }
                    dp[i][j] =  Math.min(up, Math.min(ld,rd));
                }
            }
            int mini = dp[row-1][0];
            for(int j=1;j<col;j++){
                mini = Math.min(mini, dp[row-1][j]);
            }
            return mini;
        }
    
}
