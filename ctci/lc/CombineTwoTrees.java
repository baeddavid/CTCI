// Different from merging two trees
public class CombineTwoTrees {
    // Unbalanced
    public TreeNode mergeTrees(TreeNode rootA, TreeNode rootB) {
        dfs(rootA, rootB);
        return rootA;
    }

    private void dfs(TreeNode root, TreeNode insertTree) {
        if(insertTree != null) {
            dfs(root, insertTree.left);
            addNode(root, insertTree);
            dfs(root, insertTree.right);
        }
    }

    private void addNode(TreeNode root, TreeNode insert) {
        TreeNode current = root, prev = null;
        while(current != null) {
            prev = current;
            if(insert.data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if(prev.data > insert.data) {
            prev.left = insert
        } else {
            prev.right = insert;
        }
    }
}
