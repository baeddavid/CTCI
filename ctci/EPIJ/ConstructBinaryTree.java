public class ConstructBinaryTree {
    public TreeNode constructTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);

        if(preorder.length == 1) {
            return preorder[0];
        }

        int root = Integer.MIN_VALUE;
        for(int i = 0; i < inorder.length; i++) {
            if(inorder[i] == preorder[0]) {
                root = i;
                break;
            }
        }

        int[] leftOfRootP = Arrays.copyOfRange(preorder, 1, root + 1);
        int[] leftOfRootI = Arrays.copyOfRange(inorder, 0, root);
        int[] rightOfRootP = Arrays.copyOfRange(preorder, root + 1, preorder.length);
        int[] rightOfRootI = Arrays.copyOfRange(inorder, root + 1, inorder.length);

        root.left = constructTree(leftOfRootP, leftOfRootI);
        root.right = constructTree(rightOfRootP, rightOfRootI);
        return root;
    }
}
