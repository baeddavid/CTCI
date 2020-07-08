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
}
