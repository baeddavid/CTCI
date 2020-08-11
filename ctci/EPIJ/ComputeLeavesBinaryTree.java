import java.util.List;
import java.util.ArrayList;

public class ComputeLeavesBinaryTree {
    public static List<Integer> computeLeaves(TreeNode root) {
       List<Integer> leaves = new ArrayList<>();
       helper(root, leaves);
       return leaves;
    }

    private static void helper(TreeNode root, List<Integer> leaves) {
        if(root != null) {
           if(isLeaf(root)) {
               leaves.add(root.val);
           }
           helper(root.left, leaves);
           helper(root.right, leaves);
        }
    }

    private static boolean isLeaf(TreeNode root) {
        return (root.left == null && root.right == null);
    }
}
