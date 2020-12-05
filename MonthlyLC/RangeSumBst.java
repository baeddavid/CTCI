class Solution {
    int answer;
    public int rangeSumBST(TreeNode root, int low, int high) {
        answer = 0;
        dfs(root, low, high, answer);
        return answer;
    }

    private void dfs(TreeNode root, int low, int high, int accumulator) {
        if(root != null) {
            dfs(root.left, low, high);
            if(root.val >= low && root.val <= high) { answer += root.val; }
            dfs(root.right, low, high);
        }
    }
}
