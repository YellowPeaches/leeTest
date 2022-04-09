package com;

public class _2038 {
    public static void main(String[] args) {
        String s = "BBBBBAAAAAABBBBB";
        System.out.println(winnerOfGame(s));
    }

    public static boolean winnerOfGame(String colors) {
        int len = colors.length();
        int count = 0;
        char[] chars = colors.toCharArray();
        for (int i = 0; i < len - 3; i++) {
            if (chars[i] == 'A' && chars[i + 1] == 'A' && chars[i + 2] == 'A') {
                count++;
            }
            if (chars[i] == 'B' && chars[i + 1] == 'B' && chars[i + 2] == 'B') {
                count--;
            }
        }
        return count > 0;
    }
}
