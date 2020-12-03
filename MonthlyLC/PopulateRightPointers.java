class Solution {
    // Breadth first traversal where each level is stored in an array
    public Node connect(Node root) {
        if(root == null)  { return root; }
        Queue<Node> queue = new LinkedList<>();
        Node current = root;
        queue.add(current);

        while(!queue.isEmpty()) {
            Queue<Node> temp = new LinkedList<>();
            List<Node> list = new ArrayList<>();
            while(!queue.isEmpty()) {
                current = queue.remove();
                if(current.left != null) { temp.add(current.left); }
                if(current.right != null) { temp.add(current.right); }
                list.add(current);
            }
            for(int i = 0; i < list.size() - 1; i++) {
                list.get(i).next = list.get(i + 1);
            }
            list.get(list.size() - 1).next = null;
            queue = temp;
        }
        return root;
    }
}
