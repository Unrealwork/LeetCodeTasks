import structures.trees.TreeNode;
import tasks.Solution;

public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(2);
        root.right = new TreeNode(4);
        System.out.println(Solution.maxDepth(root));
    }
}
