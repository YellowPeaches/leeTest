package com.company.normal;

public class _134 {
    public static void main(String[] args) {

    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int gasLen = gas.length;
        int curSum = 0;
        int sum = 0;
        int start = 0;
        for (int i = 0; i < gasLen; i++) {
            curSum += gas[i] - cost[i];
            sum += gas[i] - cost[i];
            if (curSum < 0) {
                start = i + 1;
                curSum = 0;
            }
        }
        if (sum < 0) {
            return -1;
        } else {
            return start;
        }
    }
}
