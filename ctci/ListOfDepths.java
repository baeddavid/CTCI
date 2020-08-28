class Solution {
    public List<Node> listDepths(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Node> list = new ArrayList<>();

        while(!queue.isEmpty()) {
            Queue<TreeNode> temp = new LinkedList<>();
            Node<Integer> head = new Node(-1);
            Node<Integer> current = head;
            while(!queue.isEmpty()) {
                TreeNode current = queue.poll();
                if(current.left != null) {
                    temp.add(current.left);
                }
                if(current.right != null) {
                    temp.add(current.right);
                }
                current.next = new Node<Integer>(current.data);
                current = current.next;
            }
            queue = temp;
            list.add(head.next);
        }
        return list;
    }
}
