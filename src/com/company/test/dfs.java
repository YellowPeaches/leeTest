package com.company.test;

import java.util.*;

public class dfs {
    static int[] book = new int[10];
    static int[] a = new int[10];
    static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dfs(n, 1);
        System.out.println(ans);
    }

    public static void dfs(int n, int step) {
        if (n + 1 == step) {
            for (int i = 1; i <= n; i++) {
                System.out.print(a[i]);
            }
            ans++;
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            if (book[i] == 0) {
                a[step] = i;
                book[i] = 1;
                dfs(n, step + 1);
                book[i] = 0;
            }
        }
        return;
    }


}
