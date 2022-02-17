/*
349. 两个数组的交集
        给定两个数组，编写一个函数来计算它们的交集。

        示例 1：

        输入：nums1 = [1,2,2,1], nums2 = [2,2]
        输出：[2]
        示例 2：

        输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        输出：[9,4]


        说明：

        输出结果中的每个元素一定是唯一的。
        我们可以不考虑输出结果的顺序。
        */

package com.company.simple;

public class _349 {
    public static void main(String[] args) {
        int sum1[] = new int[]{1, 1, 1, 2};
        int sum2[] = new int[]{4, 1, 99, 22, 2};
        new Solution().intersection(sum1, sum2);
    }

    static class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            int ans1[] = new int[1001];
            int ans2[] = new int[1001];
            int a[] = new int[1001];
            int t = 0;
            for (int i = 0; i < nums1.length; i++) {
                ans1[i]++;
            }
            for (int i = 0; i < nums2.length; i++) {
                ans2[i]++;
            }
            for (int i = 0; i < 1001; i++) {
                if (ans1[i] > 0 && ans2[i] > 0) {
                    a[t] = i;
                    t++;
                }
            }
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
            return a;
        }
    }
}
