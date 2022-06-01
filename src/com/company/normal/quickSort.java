package com.company.normal;

import java.util.HashMap;

public class quickSort {
    public static void main(String[] args) {

        HashMap<String, String> dataMap = new HashMap<>();
        dataMap.put("sss", "19");

        int[] arr = {129, 97, 9, 1, 122, 8};
        sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[] array, int left, int right) {
        if (left > right) {
            return;
        }
        int base = array[left];
        int i = left;
        int j = right;
        while (i != j) {
            while (array[j] >= base && i < j) {
                j--;
            }
            while (array[i] <= base && i < j) {
                i++;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            array[left] = array[i];
            array[i] = base;

            sort(array, left, i - 1);
            sort(array, i + 1, right);

        }
    }
}
