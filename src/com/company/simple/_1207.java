package com.company.simple;

public class _1207 {
    public static void main(String[] args) {
        int arr[] = {-1,-2,-2,-33,-33,-33,44,44,44,44,44};
        Solution s = new Solution();
        System.out.println(s.uniqueOccurrences(arr));
    }

    static class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            int len = arr.length;
            int b[] = new int[2002];
            int ans[] = new int[1001];
            for (int i = 0; i < len; i++) {
                b[arr[i]+1000]++;//将负数变为正
            }
            for (int i = 0; i < 2002; i++) {
                if (b[i] != 0) {
                    ans[b[i]]++;
                }
            }
            for (int i = 0; i < 1001; i++) {
                if (ans[i] > 1) {
                   return false;
                }
            }
            return true;
        }
    }
}
