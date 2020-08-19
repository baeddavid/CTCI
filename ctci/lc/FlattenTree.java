class Solution {
    TreeNode prev = null;
    public void flatthen(TreeNode root) {
        if(root == null) return;

        TreeNode L = root.left;
        TreeNode R = root.right;

        flatten(L);
        flatten(R);

        root.left = null;

        root.right = L;
        TreeNode current = root;
        while(current != null) {
            current = current.right;
        }
        current.right = R;
    }

    public void flatten(TreeNode root) {
        if(root == null) return;
        flatten(root.right);
        flatteen(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
}
