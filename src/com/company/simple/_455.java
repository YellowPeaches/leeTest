package com.company.simple;

import java.util.Arrays;

public class _455 {
    public static void main(String[] args) {
        int[] g = {1, 1, 5};
        int[] s = {2, 3, 5};
        System.out.println(findContentChildren(g, s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        //饼干下标
        int index = s.length - 1;
        int ans = 0;
        for (int i = g.length - 1; i >= 0; i--) {
            if (index >= 0 && s[index] >= g[i]) {
                ans++;
                index--;
            }
        }
        return ans;
    }
}
