package com.company.normal;

import java.util.Stack;

public class _20200814 {
    public static void main(String[] args) {
        String s = "(([])){}";
        int gg = 3;
        String s1 = "mississippi";
        String nee = "sipp";
        int yuan[] = {3, 2, 2, 4, 4, 4, 4, 4, 4, 23};
        Solution solution = new Solution();

        //System.out.println(solution.isValid(s));
        //System.out.println(solution.firstUniqChar("cca"));
        System.out.println(solution.strStr(s1, nee));
    }

    static class Solution {
        public int strStr(String haystack, String needle) {
            //return haystack.indexOf(needle);
            int len = haystack.length();
            int len2 = needle.length();
            int ans = -1;
            if (len2 == 0 || needle == null) {
                ans = 0;
            } else if (haystack.contains(needle)) {
                for (int i = 0; i <= len - len2; i++) {
                    if (haystack.charAt(i) == needle.charAt(0)) {
                        // System.out.println(i);
                        String temp = haystack.substring(i, i + len2);
                        if (temp.equals(needle)) {
                            ans = i;
                            break;
                        }
                    }
                }
            } else {
                return ans;
            }
            return ans;
        }

        public int removeElement(int[] nums, int val) {
            int len = nums.length;
            int k = 0;
            if (len == 0 || nums == null) {
                k = 0;
            } else {
                for (int i = 0; i < len; i++) {
                    if (nums[i] != val) {
                        nums[k++] = nums[i];
                    }
                }
            }
            return k;
        }

        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<Character>();
            for (char c : s.toCharArray()) {
                //System.out.println(c);
                if (c == '(') {
                    stack.push(')');
                } else if (c == '[') {
                    stack.push(']');
                } else if (c == '{') {
                    stack.push('}');
                } else if (stack.isEmpty() || c != stack.pop()) {
                    return false;
                }
            }
            return stack.isEmpty();
        }

        public char firstUniqChar(String s) {
            if (s.isEmpty()) {
                return ' ';
            } else {
                int a[] = new int[27];
                int l = s.length();
                for (int i = 0; i < l; i++) {
                    char temp = s.charAt(i);
                    a[temp - 97]++;
                }
                for (int i = 0; i < l; i++) {
                    if (a[(int) (s.charAt(i) - 97)] == 1) {
                        return s.charAt(i);
                    }
                }
                return ' ';
            }
        }

    }

}
