public class KthNodeInOrder {
    // Brute force solution
    TreeNode kthNodeR(TreeNode root, int k) {
        if(k == 0) {
            return root;
        } else if(root != null) {
            kthNodeR(root.left, k - 1);
            kthNodeR(roo.right, k - 1);
        }
        return null;
    }

    // Optimal Solution. Going to assume we don't have size property and implement the subroutine as well
    TreeNode kthNode(TreeNode root, int k) {
        if(root == null) {
            return null;
        }

        TreeNode current = root;
        while(current != null) {
            int leftTreeSize = getTreeSize(current.left);
            if((leftTreeSize + 1) < k) {
                k -= (leftTreeSize + 1);
                current = current.right;
            } else if(leftTreeSize == (k - 1)) {
                return current;
            } else {
                current = current.left;
            }
        }
        return null;
    }

    // The getTreeSize subroutine
    int getTreeSize(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int size = 1;
        TreeNode current = root;
        Stack <TreeNode> s = new Stack <>();

        while(current != null || !s.isEmpty()) {
            while(current != null) {
                s.push(current);
                current = current.left;
            }
            current = s.pop();
            size++;
            current = current.right;
        }
        return size;
    }
}
