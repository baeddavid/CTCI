public class ConstructTreePreorder {
    int globalIndex;

    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, 0, preorder.length);
    }

    private TreeNode helper(int[] preorder, int start, int end) {
        if(start > end) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[start]);
        int i;
        for(i = start; i <= end; i++) {
            if(preorder[i] > root.data) {
                break;
            }
        }
        root.left = helper(preorder, start + 1, i - 1);
        root.right = helper(preorder, i, end);
        return root;
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder == null) {
            return null;
        }
        globalIndex = 0;
        return bstHelper(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode bstHelper(int[] preorder, int start, int end) {
       if(nodeIndex == preorder.length || preorder[globalIndex] < start || preorder[globalIndex] > end) {
           return null;
       }

       TreeNode root = new TreeNode(preorder[globalIndex++]);
       root.left = bstHelper(preorder, start, root.data);
       root.right = bstHelper(preorder, root.data, end);
       return root;
    }
}
