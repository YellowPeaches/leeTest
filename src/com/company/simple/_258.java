package com.company.simple;

public class _258 {
    public static void main(String[] args) {
        int ans = addDigits(38);
        System.out.println(ans);
    }

    public static int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        String strNum = String.valueOf(num);
        int temp = 0;
        for (int i = 0; i < strNum.length(); i++) {
            temp += strNum.charAt(i) - 48;
        }
        return addDigits(temp);
    }
}
