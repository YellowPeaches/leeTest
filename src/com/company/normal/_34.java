package com.company.normal;

public class _34 {
    public static void main(String[] args) {
        int a[] = {6, 6};
        int t = 6;
        new Solution().searchRange(a, t);
    }

    static class Solution {
        public int[] searchRange(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            int[] ans = {-1, -1};
            while (left <= right) {
                if (nums[left] == target) {
                    ans[0] = left;
                } else {
                    left++;
                }
                if (nums[right] == target) {
                    ans[1] = right;
                } else {
                    right--;
                }
                if (ans[0] != -1 && ans[1] != -1) {
                    break;
                }
            }
            return ans;
        }

    }
}