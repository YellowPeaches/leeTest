package com.company.normal;

import java.util.*;

public class _90 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1, 2, 8, 31};
        System.out.println(Solution.subsetsWithDup(a));
    }
}

class Solution {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> cur = new ArrayList<>();

        // 枚举 i 代表，枚举所有的选择方案状态
        // 例如 [1,2]，我们有 []、[1]、[2]、[1,2] 几种方案，分别对应了 00、10、01、11 几种状态
        for (int i = 0; i < (1 << n); i++) {
            cur.clear();
            // 对当前状态进行诸位检查，如果当前状态为 1 代表被选择，加入当前方案中
            for (int j = 0; j < n; j++) {
                int t = (i >> j) & 1;
                if (t == 1) cur.add(nums[j]);
            }
            // 将当前方案中加入结果集
            ans.add(new ArrayList<>(cur));
        }
        return new ArrayList<>(ans);
    }
}


//class Solution {
//    public static List<List<Integer>> subsetsWithDup(int[] nums) {
//        Set<List<Integer>> ans= new HashSet<List<Integer>>();
//        List<Integer> temp =new ArrayList<>();
//        Arrays.sort(nums);
//        int length=nums.length;
//        for (int i = 0; i < length; i++) {
//            temp.clear();
//        }
//        return null;
//    }
//}