public class GetBoundaryOfTree {
    public List<TreeNode> getBoundaryTree(TreeNode node) {
        List<TreeNode> boundary = new ArrayList<>();
        boundary.add(node);

        leftBound(node.left, boundary);
        getLeaves(node, boundary);
        rightBound(node.right, boundary);
        return boundary;
    }

    private void leftBound(TreeNode node, List<Integer> bounds) {
        if(node == null || (node.left == null && node.right == null)) {
            return;
        }

        bounds.add(node);
        if(node.left != null) {
            leftBound(node.left, bounds);
        } else {
            leftBound(node.right, bounds);
        }
    }

    private void rightBound(TreeNode node, List<Integer> bounds) {
        if(node == null || (node.left == null && node.right == null)) {
            return;
        }

        if(node.right != null) {
            rightBound(node.right, bounds);
        } else {
            rightBound(node.left, bounds);
        }
        bounds.add(node);
    }

    private void getLeaves(TreeNode node, boundary) {
        if(node != null) {
            getLeaves(node.left, boundary);
            if(isLeaf(node)) {
                boundary.add(node);
                return;
            }
            getLeaves(node.right, boundary);
        }
    }

    private boolean isLeaf(TreeNode node) {
        return (node.left == left && node.right == null);
    }
}
