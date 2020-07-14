public class DoesPathSumExist {
    boolean pathSumExist(TreeNode root, int k) {
        if(root == null) {
            return false;
        } else if(root.left == null && root.right == null) {
            return root.data = k;
        }

        return pathSumExist(root.left, k - root.data) || pathSumExist(root.right, k - root.data);
    }
}
