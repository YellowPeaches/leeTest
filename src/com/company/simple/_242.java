package com.company.simple;

public class _242 {
    public static void main(String[] args) {
        System.out.println(new Solution().isAnagram("axbzzzooo", "azxboozzo"));
    }

    static class Solution {
        public boolean isAnagram(String s, String t) {
            int sl = s.length();
            int tl = t.length();
            if (sl != tl) {
                return false;
            }
            int temps[] = new int[26];
            int tempt[] = new int[26];
            for (int i = 0; i < sl; i++) {
                temps[s.charAt(i) - 97]++;
            }
            for (int i = 0; i < sl; i++) {
                tempt[t.charAt(i) - 97]++;
            }
//            System.out.println(Arrays.toString(temps));
//            System.out.println(Arrays.toString(tempt));
            for (int i = 0; i < 26; i++) {
                if (temps[i] != tempt[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}
