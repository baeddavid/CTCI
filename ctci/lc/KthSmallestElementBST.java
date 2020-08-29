class Solution {
    public int kthSmallesty(TreeNode root, int k) {
        List<Integer> inorder = new ArrayList<>();
        dfsArray(root, inorder);
        return inorder.get(k - 1);
    }

    private void dfsArray(TreeNode root, List<Integer> inorder) {
        if(root != null && k != 0) {
            dfsArray(root.left, k, inorder);
            inorder.add(root.val);
            dfsArray(root.right, k, inorder);
        }
    }
}
