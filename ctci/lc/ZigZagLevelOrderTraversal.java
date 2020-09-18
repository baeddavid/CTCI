import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

class Solution {
     List<List<Integer>> zigzaglevelOrder(TreeNode root) {
         List<List<Integer>> traversal = new ArrayList<>();
         if(root == null) { return traversal };

         Stack<TreeNode> stack = new Stack<>();
         stack.add(root);
         boolean isGoingRight = true;

         while(!stack.isEmpty()) {
             Stack<TreeNode> temp = new Stack<>();
             List<Integer> cTraversal = new ArrayList<>();
             while(!stack.isEmpty()) {
                 TreeNode current = stack.pop();
                 cTraversal.add(current.val);
                 if(isGoingRight) {
                     if(current.left!= null) { temp.add(current.left); }
                     if(current.right != null) { temp.add(current.right); }
                     isGoingRight = !isGoingRight;
                 } else {
                     if(current.right != null) { temp.add(current.right); }
                     if(current.left != null){ temp.add(current.left); }
                     isGoingRight = !isGoingRight;
                 }
             }
             stack = temp;
             traversal.add(cTraversal);
         }
         return traversal;
     }
 }
