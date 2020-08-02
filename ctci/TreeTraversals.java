import java.util.Stack;

public class TreeTraversals {
    // In-Order Traversal
    public void inorderR(TreeNode root) {
        if(root != null) {
            inorderR(root.left);
            System.out.print(root.data);
            inorderR(root.right);
        }
    }

    public void inorder(TreeNode root) {
        Stack <TreeNode> S = new Stack <>();
        TreeNode current = root;

        while(current != null || !S.isEmpty()) {
            while(current != null) {
                S.push(current);
                current = current.left;
            }
            current = S.pop();
            System.out.print(current.data);
            current = current.right;
        }
    }

    // Pre-Order Traversal
    public void preorderR(TreeNode root) {
        if(root != null) {
            System.out.print(root.data);
            preorderR(root.left);
            preorderR(root.right);'
        }
    }

    public void preorder(TreeNode root) {
        if(root == null) {
            return null;
        }

        Stack <TreeNode> S = new Stack <>();
        S.push(root);
        while(!S.isEmpty()) {
            root = S.pop();
            System.out.print(root.data);
            if(root.right != null) {
                S.push(root.right);
            }
            if(root.left != null) {
                S.push(root.left);
            }
        }

    }

    // Post-Order Traversal
    public void postorderR(TreeNode root) {
        if(root != null) {
            postorderR(root.left);
            postorderR(root.right);
            System.out.print(root.data);
        }
    }

    public void postorder(Treenode root) {
        if(root == null) {
            return null;
        }

        Stack <TreeNode> S = new Stack <>();
        S.push(root);
        Stack <Integer> out = new Stack <>();

        while(!S.isEmpty()) {
            TreeNode curr = S.pop();
            out.push(curr.data);
            if(curr.left != null) {
                S.push(curr.left);
            }

            if(curr.right != null) {
                S.push(curr.right);
            }
        }

        while(!out.isEmpty()) {
            TreeNode temp = out.pop();
            System.out.print(temp.data);
        }
    }
}
