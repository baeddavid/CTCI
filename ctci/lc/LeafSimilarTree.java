import java.util.List;
import java.util.ArrayList;

public class LeafSimilarTree {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> L1 = new ArrayList<>();
        List<Integer> L2 = new ArrayList<>();

        helper(root1, L1);
        helper(root2, L2);

        return L1.equals(L2);
    }

    private void helper(TreeNode root, List<Integer> dfs) {
        if(root != null) {
            helper(root.left, dfs);
            if(isLeaf(root)) {
                dfs.add(root);
            }
            helper(root.right, dfs);
        }
    }

    private boolean isLeaf(TreeNode node) {
        return (node.left == null && node.right == null);
    }
}
