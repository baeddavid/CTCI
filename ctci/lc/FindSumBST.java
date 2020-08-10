import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class FindSumBST {
    // Tree traversal method
    public Answer findSum(TreeNode m, TreeNode n, int x) {
       Stack<TreeNode> S = new Stack<>();
       TreeNode current = n;
       while(current != null || !S.isEmpty()) {
           while(current != null) {
               S.push(current);
               current = current.left;
           }
           current = S.pop();
           TreeNode key = search(m, x - current.val);
           if(key != null) {
               return new Answer(current, key)
           }
           current = current.right;
       }
       return null;
    }

    private TreeNode search(TreeNode root, int k) {
        while(root != null) {
            if(root.val == k) {
                return root;
            } else if(root.val > k) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return null;
    }

class Answer {
    TreeNode a;
    TreeNode b;

    public Answer(TreeNode a, TreeNode b) {
        this.a = a;
        this.b = b;
    }
}
