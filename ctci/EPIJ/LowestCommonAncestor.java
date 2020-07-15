public class LowestCommonAncestor {
    public boolean lowestCommonAncestor(TreeNode root, TreeNode x, TreeNode y) {
        return helper(root, x, y).ancestor;
    }

    public Status helper(TreeNode root, TreeNode x, TreeNode y) {
        if(root == null) {
            return null;
        }

        Status LeftTree = helper(root.left, x, y);
        if(LeftTree.count == 2) {
            return LeftTree;
        }

        Status RightTree = helper(root.right, x, y);
        if(RightTree.count == 2) {
            return RightTree;
        }

        int count = LeftTree.count + RightTree.count + (root == x ? 1 : 0) + (root == y ? 1 : 0);
        return new Status(count, (count == 2 ? root : null));
    }
}

class Status {
    public int count;
    public TreeNode ancestor;

    public Status(int count, TreeNode ancestor) {
        this.count = count;
        this.ancestor = ancestor;
    }
}
