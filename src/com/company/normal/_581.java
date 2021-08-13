package com.company.normal;

public class _581 {

    public static void main(String[] args) {

    }

    public static int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int s = 0;
        int e = 0;
        for (int i = 0; i < len; i++) {
            if (max > nums[i]) {
                e = i;
                //max=nums[i];
            }
            max = Math.max(max, nums[i]);
        }
        for (int i = len - 1; i >= 0; i--) {
            if (min < nums[i]) {
                s = i;
            }
            min = Math.min(min, nums[i]);
        }
        if (e == s) {
            return 0;
        } else {
            return e - s + 1;
        }
    }
}
