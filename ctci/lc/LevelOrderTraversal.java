public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> traversal = new ArrayList<>();
        if(root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            Queue<TreeNode> temp = new LinkedList<>();
            List<Integer> list = new ArrayList<>();
            while(!queue.isEmpty()) {
                TreeNode curr = queue.poll();
                list.add(curr.val);

                if(curr.left != null) {
                    temp.add(curr.left);
                }

                if(curr.righ != null) {
                    temp.add(curr.right);
                }
            }
            queue = temp;
            traversal.add(list);
        }
        return traversal;
    }
}
