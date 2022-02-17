package com.company.normal;

public class _240 {
    public static void main(String[] args) {
        int a[][] = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}};
        int b[][] = {{1, 21}};
        System.out.println(searchMatrix(b, 21));
    }


    public static boolean searchMatrix(int[][] matrix, int target) {
        int lenX = matrix[0].length;
        int lenY = matrix.length;
        for (int i = 0; i < lenY; i++) {
            if (matrix[i][0] <= target && matrix[i][lenX - 1] >= target) {
                for (int j = 0; j < lenX; j++) {
                    if (matrix[i][j] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
