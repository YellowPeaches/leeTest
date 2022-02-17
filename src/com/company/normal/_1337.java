package com.company.normal;

public class _1337 {

    public static void main(String[] args) {
        int[][] mat = {{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}};
        int[] ints = kWeakestRows(mat, 2);
        for (int i = 0; i < 2; i++) {
            System.out.println(ints[i]);
        }

    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        int[] temp = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] != 0) {
                    temp[i]++;
                } else {
                    break;
                }
            }
        }

        int index = 0;
        for (int x = 0; ; x++) {
            for (int i = 0; i < temp.length && index < k; i++) {
                if (temp[i] == x) {
                    ans[index] = i;
                    index++;
                }

            }
            if (index >= k) {
                break;
            }
        }
        return ans;
    }

}

