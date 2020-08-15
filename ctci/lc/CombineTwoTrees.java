// Different from merging two trees
public class CombineTwoTrees {
    // Unbalanced
    public TreeNode mergeTrees(TreeNode rootA, TreeNode rootB) {
        dfs(rootA, rootB);
        return rootA;
    }

    private void dfs(TreeNode root, TreeNode insertTree) {
        if(insertTree != null) {
            dfs(root, insertTree.left);
            addNode(root, insertTree);
            dfs(root, insertTree.right);
        }
    }

    private void addNode(TreeNode root, TreeNode insert) {
        TreeNode current = root, prev = null;
        while(current != null) {
            prev = current;
            if(insert.data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if(prev.data > insert.data) {
            prev.left = insert
        } else {
            prev.right = insert;
        }
    }

    // Balanced Tree Solution
    public TreeNode mergeTreesBalanced(TreeNode rootA, TreeNode rootB) {
        List<Integer> L1 = new ArrayList<>();
        List<Integer> L2 = new ArrayList<>();

        addValuestoList(rootA, L1);
        addValuestoList(rootB, L2);

        List<Integer> mergedList = mergeLists(L1, L2);
        TreeNode root = buildTree(mergedList, 0, mergedList.size() - 1);
        return root;
    }

    private TreeNode buildTree(List<Integer> list, int left, int right) {
        if(left > right) {
            return null;
        }

        int med = left + (right - left) / 2;
        TreeNode root = list.get(med);
        root.left = buildTree(list, left, med - 1);
        root.right = buildTree(list, med + 1, right);

        return root;
    }

    private List<Integer> mergeLists(List<Integer> L1, List<Integer> L2) {
        List<Integer> mergeList= new ArrayList<>();
        int pointerL1 = 0, pointerL2 = 0;

        while(pointerL1 < L1.size() && pointerL2 < L2.size()) {
            if(L1.get(pointerL1) < L2.get(pointerL2)) {
                mergeList.add(L1.get(pointerL1++));
            } else {
                mergeList.add(L2.get(pointerL2++));
            }
        }

        while(pointerL1 < L1.size()) {
            mergeList.add(L1.get(pointerL1++));
        }

        while(pointerL2 < L2.size()) {
            mergeList.add(L2.get(pointerL2++));
        }
        return mergeList;
    }

    private void addValuestoList(TreeNode root, List<Integer> L) {
        if(root != null) {
            addValuestoList(root.left, L);
            L.add(root.val);
            addValuestoList(root.right, L);
        }
    }
}
