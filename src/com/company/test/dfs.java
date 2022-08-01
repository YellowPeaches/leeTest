package com.company.test;


import java.util.*;

public class dfs {
    static int[] book = new int[10];
    static int[] a = new int[10];
    static int ans = 0;

    public static void main(String[] args) {
        System.out.println("8B900A88-0935-49B2-9B6F-39CBF5BDDEEA ".length());
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dfs(n, 1);
        System.out.println(ans);
    }

    public static void dfs(int n, int step) {
        if (n + 1 == step) {
            for (int i = 1; i <= n; i++) {
                System.out.print(a[i]);
            }
            ans++;
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            if (book[i] == 0) {
                a[step] = i;
                book[i] = 1;
                dfs(n, step + 1);
                book[i] = 0;
            }
        }
        return;
    }


}
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];

        dfs(res, temp, visited, nums);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> temp, boolean[] visited, int[] nums){
        if(temp.size() == nums.length){
            res.add(new ArrayList<Integer>(temp));
            return;
        }

        for(int i = 0;i<nums.length; i++){
            if(!visited[i]){
                temp.add(nums[i]);
                visited[i] = true;
                dfs(res, temp, visited, nums);
                temp.remove(temp.size()-1);
                visited[i] = false;
            }
        }

    }
}
class Solution2 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        List<Integer> output = new ArrayList<Integer>();
        for (int num : nums) {
            output.add(num);
        }

        int n = nums.length;
        backtrack(n, output, res, 0);
        return res;
    }

    public void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
        // 所有数都填完了
        if (first == n) {
            res.add(new ArrayList<Integer>(output));
        }
        for (int i = first; i < n; i++) {
            // 动态维护数组
            Collections.swap(output, first, i);
            // 继续递归填下一个数
            backtrack(n, output, res, first + 1);
            // 撤销操作
            Collections.swap(output, first, i);
        }
    }
}

