public class InOrderTraversal {
    // Recursion
    public void inOrder(TreeNode root) {
        if(root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    // Iterative
    public void inOrderStack(TreeNode root) {
        Stack <TreeNode> s = new Stack <>();
        TreeNode current = root;
        s.push(current);

        while(current != null || !s.isEmpty()) {
            while(current != null) {
                current = current.left;
                s.push(current);
            }
            current = s.pop();
            System.out.println(current.data);
            current = current.right;
        }
    }
}
