public class RangeSum {
    // Recursive solution
    // Class variable for recursion
    int sum = 0;
    int rangeSum(TreeNode root, int L, int R){
        getSum(root, L, R);
        return sum;
    }

    void rangeSum(TreeNode root, int L, int R) {
        if(root != null) {
            rangeSum(root.left, L, R);
            if(L <= root.val && root.val <= R) {
                sum += root.val;
            }
            rangeSum(root.right, L, R);
        }
    }
    // Iterative Solution
    int rangeSum(Treenode root, int L, int R) {
        int sum = 0;
        TreeNode current = root;
        Stack <TreeNode> s = new Stack <>();

        while(current != null || !s.isEmpty()) {
            while(current != null) {
                s.push(current);
                current = current.left;
            }
            current = s.pop();
            if(L <= current.val && current.val <= R) {
                sum += current.val;
            }
            current = current.right;
        }
        return sum;
    }

    // Second Variation
    int rangeSumSecond(TreeNode root, int L, int R) {
        if(isInRange(root.val)) {
            sum += root.val;
        }

        rangeSumSecond(root.left, L, R);
        rangeSumSecond(root.right, L, R);

        return sum;
    }

    private boolean isInRange(int x, int i, int j) {
        return (x >= i && x <= j);
    }
}
