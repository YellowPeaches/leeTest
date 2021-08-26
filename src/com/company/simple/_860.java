package com.company.simple;

public class _860 {
    public static void main(String[] args) {
        int[] a = {5, 5, 5, 5, 20, 20, 5, 5, 5, 5};
        System.out.println(lemonadeChange(a));
    }

    public static boolean lemonadeChange(int[] bills) {
        if (bills[0] > 5 || bills[1] > 10) {
            return false;
        }
        int len = bills.length;
        int five = 0, ten = 0;
        for (int i = 0; i < len; i++) {
            if (bills[i] == 5) {
                five++;
            }
            if (bills[i] == 10) {
                five--;
                ten++;
            }
            if (bills[i] == 20) {
                if (ten > 0) {
                    ten--;
                    five--;
                } else {
                    five -= 3;
                }
            }
            if (ten < 0 || five < 0) {
                return false;
            }
        }
        return true;
    }
}
