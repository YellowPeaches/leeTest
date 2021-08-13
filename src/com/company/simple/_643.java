package com.company.simple;

public class _643 {
    public static void main(String[] args) {
        int[] nums = {-1,-9};
        double ans = findMaxAverage(nums, 1);
        System.out.println(ans);
    }

    public static double findMaxAverage(int[] nums, int k) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            double sum = 0;
            for (int j = i; j < i + k && i + k <= nums.length; j++) {
                sum += nums[j];
            }
            if (sum / k > max) {
                max = sum / k;
            }
        }
        return max;
    }
}
