import java.util.Queue;

public class LevelOrderTree {
    public void levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> Q = new Queue<>();
        Q.add(root);

        while(!Q.isEmpty()) {
            TreeNode node = Q.poll();
            System.out.println(node.data);
            if(node.left != null) {
                Q.add(node.left);
            }
            if(node.right != null) {
                Q.add(node.right);
            }
        }
    }

    public void levelOrderR(TreeNode root) {
        int height = getHeight(root);
        for(int i = 1; i <= height; i++) {
            printLevel(root, i);
        }
    }

    private int getHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftTree = getHeight(root.left);
        int rightTree = getHeight(root.right);
        return Math.max(leftTree, rightTree) + 1;
    }

    private void printLevel(TreeNode root, int i) {
        if(root == null) {
            return;
        } else if(i == 1) {
            System.out.println(root.data);
        } else {
            printLevel(root.left, i - 1);
            printLevel(root.right, i - 1);
        }
    }
}
