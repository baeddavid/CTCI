class Solution {
    int result = 0;

    public int maxAncestorDiff(TreeNode root) {
        if(root == null) { return 0; }
        result = 0;
        helper(root, root.val, root.val);
        return result;
    }

    void helper(TreeNode node, int currMax, int currMin) {
        if(node == null) { return; }
        // Potential answer here
        int candidate = Math.max(Math.abs(currMax - node.val), Math.abs(currMin - curr.val));
        result = Math.max(candidate, result);

        // Pass the values down our recursive calls
        currMax = Math.max(currMax, node.val);
        currMin = Math.min(currMin, node.val);
        helper(node.left, currMax, currMin);
        helper(node.right, currMax, currMin);
        return;
    }
}
