package com.company.normal;

public class _553 {
    public static void main(String[] args) {
        int[] test = {1000, 100, 10, 2};
        System.out.println(optimalDivision(test));
    }

    public static String optimalDivision(int[] nums) {
        StringBuilder sb = new StringBuilder();
        int len = nums.length;
        if (len == 1) {
            return sb.append(nums[0]).toString();
        }
        sb.append(nums[0]).append('/');
        if (len == 2) {
            return sb.append(nums[1]).toString();
        }
        sb.append('(');
        for (int i = 1; i < len - 1; i++) {
            sb.append(nums[i]).append('/');
        }
        return sb.append(nums[len - 1]).append(')').toString();

    }
}
