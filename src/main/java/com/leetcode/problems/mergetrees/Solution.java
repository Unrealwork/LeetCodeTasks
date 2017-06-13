package com.leetcode.problems.mergetrees;

import com.leetcode.problems.models.TreeNode;

public class Solution {

    /**
     *
     * @param t1
     * @param t2
     * @return
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        int newVal = (t1 == null) ? t2.val : (t2 == null) ? t1.val : t1.val + t2.val;
        TreeNode newTree = new TreeNode(newVal);
        newTree.left = mergeTrees((t1 != null) ? t1.left : null, (t2 != null) ? t2.left : null);
        newTree.right = mergeTrees((t1 != null) ? t1.right : null, (t2 != null) ? t2.right : null);
        return newTree;
    }
}
