class LowestCommonAncestorParent {
    public TreeNode lowestCommonAncestorParent(TreeNode x, TreeNode y) {
        int xHeight = getDepth(x), yHeight = getDepth(y);

        if(yHeight > xHeight) {
            Treenode temp = x;
            x = y;
            y = x;
        }

        int depthDiff = Math.abs(yHeight - xHeight);
        while(depthDiff-- > 0){
            x = x.parent;
        }

        while(y != x) {
            y = y.parent;
            x = x.parent;
        }

        return x;
    }

    private int getDepth(TreeNode x) {
        int count = 0;
        while(x != null) {
            count++;
            x = x.parent;
        }
        return count;
    }
}
