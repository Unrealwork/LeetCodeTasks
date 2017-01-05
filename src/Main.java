import com.leetcode.problems.structures.trees.TreeNode;
import com.leetcode.problems.digitalroot.DigitalRoot;

public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(2);
        root.right = new TreeNode(4);
        System.out.println(DigitalRoot.maxDepth(root));
    }
}
