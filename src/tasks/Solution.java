package tasks;

import structures.trees.TreeNode;

/**
 * Created by shmagrinskiy on 27.10.15.
 */


public class Solution {
    /**
     * Вычисление цифрового корня числа за O(1)
     * @param num
     * @return
     */
    public static int addDigits(int num) {
        return 1 + (num - 1) % 9;
    }

    /**
     * Поиск максимальной глубины в двоичном дереве
     * рекурсивная функция
     * @param curNode - текущий узел
     * @param height - глубина - текущая
     * @return
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
     * @desc Поиск максимальной глубины в дереве
     * @param root
     * @return
     */
    public static int maxDepth(TreeNode root) {
       return maxDepthRecursive(root, 0);
    }
}
