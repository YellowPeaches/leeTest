package com.company.normal;

public class _659 {
    public static void main(String[] args) {
        int[] a={1,2,3,3,4,4,5};
        System.out.println(new Solution().isPossible(a));
    }

    static class Solution {
        public boolean isPossible(int[] nums) {
            int n = nums.length;
            int res[] = new int[n];
            int cnt[] = new int[n];
            int a = 0;
            for (int i = 0; i < n; i++) {
                int idx = -1;
                for (int j = 0; j < a; j++) {
                    if (nums[i] == res[j] + 1) {
                        if (idx == -1 || cnt[j] < cnt[idx]) {
                            idx = j;
                        }
                    }
                }
                if (idx == -1) {
                    cnt[a]++;
                    res[a] = nums[i];
                    a++;
                } else {
                    cnt[idx]++;
                    res[idx] = nums[i];
                }

            }
            for (int i = 0; i < n; i++) {
                if (cnt[i] != 0 && cnt[i] < 3) {
                    return false;
                }
            }

            return true;
        }
    }
}

