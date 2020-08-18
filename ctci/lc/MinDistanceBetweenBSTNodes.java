class Solution {
    public int minDiffInBst(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        treeToList(root, list);

        for(int i = 1; i < list.size(); i++) {
            min = Math.min(min, list.get(i) - list.get(i - 1));
        }

        return min;
    }

    private void treeToList(TreeNode root, List<Integer> list) {
        if(root != null) {
            treeToList(root.left, list);
            list.add(root.val);
            treeToList(root.right, list);
        }
    }
}
