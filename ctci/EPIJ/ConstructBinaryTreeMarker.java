public class ConstructBinaryTreeMarker {
    public static int globalIndex;

    public static TreeNode constructTree(List<Integer> preorder) {
        return helper(preorder);
    }

    private static TreeNode helper(List<Integer> preorder) {
        int rootValue = preorder.get(globalIndex++);
        if(rootValue == null) {
            return null;
        }
        TreeNode root = new TreeNode(rootValue);
        root.left = helper(preorder);
        root.right = helper(preorder);
        return root;
    }
}
