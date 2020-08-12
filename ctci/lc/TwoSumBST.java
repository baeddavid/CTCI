public class TwoSumBST {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> L = new ArrayList<>();
        dfs(root, L);
        int left = 0, right = L.size() - 1;
        while(left < right) {
            if(L.get(left) + L.get(right) == k) {
                return true;
            } else if(L.get(left) + L.get(right) > k) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }

    private void dfs(TreeNode root, List<Integer> L) {
        if(root != null) {
            dfs(root.left, L);
            L.add(root.val);
            dfs(root.right, L);
        }
    }
}
