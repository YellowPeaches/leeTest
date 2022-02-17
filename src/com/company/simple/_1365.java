package com.company.simple;

public class _1365 {
    public static void main(String[] args) {
        int nums[] = {99, 3, 5, 33, 44, 55};
        Solution s = new Solution();
        int a[] = s.smallerNumbersThanCurrent(nums);
        for (int n = 0; n < a.length; n++) {
            System.out.print(a[n] + " ");
        }
    }

    static class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int len = nums.length;
            int ans[] = new int[len];
            for (int i = 0; i < len; i++) {
                int temp = 0;
                for (int j = 0; j < len; j++) {
                    if (nums[i] > nums[j] && i != j) {
                        temp++;
                    }
                }
                ans[i] = temp;
            }
            return ans;
        }
    }
}

