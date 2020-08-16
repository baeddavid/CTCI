import java.util.Stack;

public class PreorderTraversalIterative {
    public void iterativePreorder(TreeNode node) {
       Stack<TreeNode> stack = new Stack<>();
       stack.push(node);

       while(!stack.isEmpty()) {
           TreeNode curr = stack.pop();
           System.out.println(curr.data);
           if(current.right != null) {
               stack.add(curr.right);
           }
           if(current.left != null) {
               stack.add(curr.left);
           }
       }
    }
}
