public class KthNodeInOrder {
    // Brute force solution
    TreeNode kthNodeR(TreeNode root, int k) {
        if(k == 0) {
            return root;
        } else if(root != null) {
            kthNodeR(root.left, k - 1);
            kthNodeR(roo.right, k - 1);
        }
        return null;
    }
}
