// A simple solution to finding the lowest common ancestor. We take advantage of the fact that lowest
// common ancestors have children in different trees. We can work downwards on the tree.

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode a, TreeNode b) {
        if(root == null || a == root || b == root) {
            return root;
        }

        boolean leftTreeContainsA = cover(root, a);
        boolean leftTreeContainsB = cover(root, b);

        if(leftTreeContainsA != leftTreeContainsB) return true;

        TreeNode childTree = leftTreeContainsA ? root.left : root.right;
        return lowestCommonAncestor(childTree, a, b);
    }

    private boolean cover(TreeNode root, TreeNode node) {
        if(root == null) return false;
        if(root == node) return true;

        return cover(root.left, node) || cover(root.right, node);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode a, TreeNode b) {
        return lcaHelper(root, a, b).getAncestor();
    }

    private LCA lcaHelper(TreeNode root, TreeNode a, TreeNode b) {
        if(root == null) {
            return new LCA(0, null);
        }
        LCA left = lcaHelper(root.left, a, b);
        if(left.getNumber() == 2) {
            return left;
        }

        LCA right = lcaHelper(root.right, a, b);
        if(right.getNumber() == 2) {
            return right;
        }

        int numberNodes = left.getNumber() + right.getNumber() + (root == a ? 1 : 0) + (root == b ? 1 : 0);
        return new LCA(numberNodes, (numberNodes == 2 ? root : null));
    }
}

// A different solution where we create a custom data type
class LCA {
    private int numberNodes;
    private TreeNode ancestor;

    public LCA(int numberNodes, TreeNode ancestor) {
        this.numberNodes = numberNodes;
        this.ancestor = ancestor;
    }

    public TreeNode getAncestor() {
        return ancestor;
    }

    public int getNumber() {
        return numberNodes;
    }
}
