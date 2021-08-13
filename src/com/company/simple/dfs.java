package com.company.simple;

import java.util.Scanner;

public class dfs {
    private static int n;
    private static int[] a = new int[20];
    private static int[] book = new int[20];
    private static int[] ans = new int[20];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            n = sc.nextInt();
            if (n <= 0) {
                break;
            } else {
                ddffss(1);
            }
        }
    }

    public static void ddffss(int step) {
        if (step == n + 1) {
            for (int i = 1; i < n + 1; i++) {
                System.out.print(ans[i]);
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            if (book[i] == 0) {
                ans[step] = i;
                book[i] = 1;
                ddffss(step + 1);
                book[i] = 0;
            }
        }
    }
}
