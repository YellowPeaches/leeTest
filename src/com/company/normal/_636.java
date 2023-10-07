package com.company.normal;

import java.util.List;

public class _636 {

    public static void main(String[] args) {

    }

    public int[] exclusiveTime(int n, List<String> logs) {
        int[] ans = new int[n];
        int len =logs.size();
        for (int i = 1; i < len; i++) {
            String[] lastTemp = logs.get(i-1).split(":");
            String[] temp = logs.get(i).split(":");
//            ans[Integer.parseInt(lastTemp[0])]= temp[Integer.parseInt(temp[2])];

        }


        return ans;
    }
}
