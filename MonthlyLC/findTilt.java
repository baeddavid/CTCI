class Solution {
    int result;
    public int findTilt(TreeNode root) {
        result = 0;
        helper(root)
        return result;
    }
    
    public int helper(TreeNode root) {
        if(root == null) { return 0; }
        if(root.left == null && root.right == null) { return root.val; }
        int leftResult = helper(root.left);
        int rightResult = helper(root.right);
        result += Math.abs(leftResult - rightResult);
        return leftResult + rightResult + root.val;
    }
}
 
