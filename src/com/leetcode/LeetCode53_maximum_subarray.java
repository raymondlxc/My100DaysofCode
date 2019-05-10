package com.leetcode;

class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        if(len == 0)return 0;
        if(len ==1)return nums[0];
        dp[0] = nums[0];
        int result = dp[0];
        int i = 1;
        for(; i < len;i++){
            if(dp[i-1] > 0){
                dp[i] = dp[i-1]+nums[i];
            }
            else{
                dp[i] = nums[i];
            }
            result = Math.max(dp[i], result);

        }
        return result;
    }
}