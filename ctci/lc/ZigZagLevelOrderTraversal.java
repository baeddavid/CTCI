class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> traversals = new ArrayList<>();
        if(root = null) {
            return traversals;
        }
        Stack<TreeNode> stack = new Stack<>();
        boolean isRight = false;

        while(!stack.isEmpty()) {
            Stack<TreeNode> temp = new Stack<>();
            List<Integer> currentTraversal = new ArrayList<>();
            while(!stack.isEmpty()) {
                TreeNode current = stack.pop();
                currentTraversal.add(current.val);
                if(isRight) {
                    if(current.left != null) {
                        temp.push(current.left);
                    }
                    if(current.right != null) {
                        temp.push(current.right);
                    }
                } else {
                    if(current.right != null) {
                        temp.push(current.right);
                    }
                    if(current.left != null) {
                        temp.push(current.left);
                    }
                }
           }
            traversals.add(currentTraversal);
            isRight = !isRight;
        }
        return traversals;
    }
}
