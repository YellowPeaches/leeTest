package com.company.simple;

public class _53 {
    public static void main(String[] args) {
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(a));

    }

    public static int maxSubArray(int[] nums) {
        int len = nums.length;
        int ans = -100000;
        int curMax = 0;
        for (int i = 0; i < len; i++) {
            curMax += nums[i];
            if (curMax > ans) {
                ans = curMax;
            }
            if (curMax < 0) {
                curMax = 0;
            }
        }
        return ans;
    }

    public static int maxSubArrayDP(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int[] dp = new int[len];
        dp[0] = nums[0];
        int ans = dp[0];
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            if (dp[i] > ans) {
                ans = dp[i];
            }
        }
        return ans;
    }
}
