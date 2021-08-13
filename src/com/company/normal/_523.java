package com.company.normal;

public class _523 {
    public static void main(String[] args) {
        int[] a = {5, 4, 5};
        System.out.println(checkSubarraySum(a, 5));
    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        if (n < 2) {
            return false;
        }
        int[] sum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            sum[i] = nums[i - 1] + sum[i - 1];
        }
        // i为右端点，j为左端点
        for (int i = 2; i <= n; ++i) {
            // 前缀和比k小跳过，当有两个连续的0时除外
            if (sum[i] < k && sum[i] != sum[i - 2]) {
                continue;
            }
            // 遍历每种左端点
            for (int j = 0; j <= i - 2; ++j) {
                if ((sum[i] - sum[j]) % k == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
