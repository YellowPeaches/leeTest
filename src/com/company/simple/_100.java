package com.company.simple;

import java.util.*;

public class _100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (q == null || p == null) {
            return false;
        } else if (q.val != p.val) {
            return false;
        } else {
            return isSameTree(q.left, p.left) && isSameTree(q.right, p.right);
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() > 0) {
            int num = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                TreeNode current = queue.poll();
                temp.add(current.val);
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            ans.add(temp);
        }


        return ans;
    }

    int sum = 0;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {

        }

        return false;
    }

    public int findMaxLength(int[] nums) {
        int cur = 0, ans = 0;
        int length = nums.length;
        // 避免扩容
        Map<Integer, Integer> map = new HashMap<>(length, 1.05f);
        map.put(0, -1);
        for (int i = 0; i < length; i++) {
            // 遇到 0 减一；遇到 1 加一
            nums[i] = nums[i] == 0 ? --cur : ++cur;
            if (map.containsKey(cur)) {
                ans = Math.max(ans, i - map.get(cur));
            } else {
                map.put(cur, i);
//                Arrays.sort();
            }
        }
        return ans;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

