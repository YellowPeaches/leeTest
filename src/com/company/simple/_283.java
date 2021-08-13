package com.company.simple;

public class _283 {
    public static void main(String[] args) {
        int nums[] = new int[]{1, 0, 0, 3, 12, 44, 3444, 3, 0};
        new Solution().moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    static class Solution {
        public void moveZeroes(int[] nums) {
            int num0 = 0;
            int len = nums.length;
            for (int i = 0; i < len; i++) {
                if (nums[i] == 0) {
                    for (int j = i + 1; j < len; j++) {
                        if (nums[j] != 0) {
                            nums[i] = nums[j];
                            nums[j] = 0;
                            break;
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }
}
