import java.util.Stack;

public class MergeTwoBinaryTrees {
   TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
       // If the first tree does not exist then we can return the second tree
       if(t1 == null) {
           return t2;
       }

       // If the second tree does not exist then we return the first tree
       if(t2 == null) {
           return t1;
       }

       // Both t1 and t2 exist, so we add t2 to t1.
       t1 += t2.data;
       // t1's left subtree is the result of t1.left and t2.left
       t1.left = mergeTrees(t1.left, t2.left);
       // t1's right subtree is the result of t1.right and t2.right
       t1.right = mergeTrees(t1.right, t2.right);
       // Our recursion has termianted and return t1
       return t1;
   }

    // Iterative Stack Solution
    TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        Stack <TreeNode []> stack = New Stack <>();
        Stack.push(new TreeNode[] {t1, t2});

        while(!stack.isEmpty()) {
            TreeNode[] treeArr = Stack.pop();
            if(treeArr[0] == null || treeArr[1] == null) {
                continue;
            }

            TreeArr[0] += TreeArr[1];
            if(treeArr[0] = null) {
                treeArr[0].left = treeArr[1].left;
            } else {
                Stack.push(new TreeNode[] {treeArr[0].left, treeArr[1].left});
            }

            if(treeArr[0] == null) {
                treeArr[0].right = treeArr[1].right;
            } else {
                Stack.push(new TreeNode[] {treeArr[0].right, treeArr[1].right});
            }
        }
        return t1;
    }
}
