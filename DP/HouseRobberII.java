package DAY26;

import java.util.Arrays;

public class HouseRobberII {
    public int[] dp;
    
    public int f(int index, int last, int[] nums){
        
        if(index >last) return 0;
        if(dp[index] != -1) return dp[index];
        
        return dp[index] = Math.max(nums[index]+f(index+2, last, nums), f(index+1,last, nums));
    }
    
    public int rob(int[] nums) {
        dp = new int[1000];
        Arrays.fill(dp,-1);
        if(nums.length ==1) return nums[0];
        int case1 = f(0,nums.length-2,nums);
        Arrays.fill(dp,-1);
        int case2 = f(1,nums.length-1,nums);
        
        int ans= Math.max(case1, case2);
        return ans;
    }
}
