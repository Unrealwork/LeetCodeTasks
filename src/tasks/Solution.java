package tasks;

import structures.trees.TreeNode;

/**
 * Tasks form LeetCode
 */


public class Solution {
    /**
     * Вычисление цифрового корня числа за O(1)
     * @param num - число для которого нужно вычислить цифровой корень
     * @return цифровой корень числа n
     */
    public static int addDigits(int num) {
        return 1 + (num - 1) % 9;
    }

    /**
     * Поиск максимальной глубины в двоичном дереве
     * рекурсивная функция
     * @param curNode - текущий узел
     * @param height - глубина - текущая
     * @return максимальную глубину для текущего узла
     */
    private static int maxDepthRecursive(TreeNode curNode, int height) {
        if (curNode == null) {
            return height;
        } else {
            height++;
            return Math.max(maxDepthRecursive(curNode.left, height), maxDepthRecursive(curNode.right, height));
        }
    }

    /**
     * Поиск максимальной глубины в дереве
     * @param root корень дерева
     * @see <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/">Max Tree Depth</a>
     * @return максимальную глубину для текущего дерева
     */
    public static int maxDepth(TreeNode root) {
       return maxDepthRecursive(root, 0);
    }
}
