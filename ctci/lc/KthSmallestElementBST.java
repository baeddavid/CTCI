class Solution {
    // Recursive Solution
    public int kthSmallesty(TreeNode root, int k) {
        List<Integer> inorder = new ArrayList<>();
        dfsArray(root, inorder);
        return inorder.get(k - 1);
    }

    private void dfsArray(TreeNode root, List<Integer> inorder) {
        if(root != null && k != 0) {
            dfsArray(root.left, k, inorder);
            inorder.add(root.val);
            dfsArray(root.right, k, inorder);
        }
    }

    // Iterative Stack Solution
    public int KthSmallest(TreeNode root, int k) {
        Stack<Integer> stack = new Stack<>();
        while(!stack.isEmpty() || root != null) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode current = stack.pop();
            k--;
            if(k == 0) return current.val;
            current = current.right;
        }
        // This should be unreachable if the inputs are valid
        return -1;
    }

    // Clever approach
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return null;
        TreeNode current = root;
        while(current != null) {
            int leftTreeSize = getTreeSize(root.left);
            if(leftTreeSize + 1 > k) {
                k -= (leftTreeSize + 1);
                current = current.right;
            } else if(leftTreeSize == k - 1) return current.val;
            else {
                current = current.left;
            }
        }
        return null;
    }

    private int getTreeSize(TreeNode root) {
        int count = 0;
        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !Stack.isEmpty()) {
            while(root != nulll) {
                stack.push(root);
                root = root.left;
            }
            TreeNode current = stack.pop();
            count++;
            current = current.right;
        }
        return count;
    }
}
