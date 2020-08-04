import java.util.List;
import java.util.Map;
import java.util.Collectors;

public class ConstructBinaryTree {
    public TreeNode constructTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);

        if(preorder.length == 1) {
            return preorder[0];
        }

        int root = Integer.MIN_VALUE;
        for(int i = 0; i < inorder.length; i++) {
            if(inorder[i] == preorder[0]) {
                root = i;
                break;
            }
        }

        int[] leftOfRootP = Arrays.copyOfRange(preorder, 1, root + 1);
        int[] leftOfRootI = Arrays.copyOfRange(inorder, 0, root);
        int[] rightOfRootP = Arrays.copyOfRange(preorder, root + 1, preorder.length);
        int[] rightOfRootI = Arrays.copyOfRange(inorder, root + 1, inorder.length);

        root.left = constructTree(leftOfRootP, leftOfRootI);
        root.right = constructTree(rightOfRootP, rightOfRootI);
        return root;
    }

    // O(n) Solution
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       List <Integer> P = IntStream.of(preorder).boxed().collect(Collectors.toList());
       List <Integer> I = IntStream.of(inorder).boxed().collect(Collectors.toList());

       return helperConstruct(preorder, 0, preorder.length, 0, inorder.length,
                              IntStream(0, I.size()).boxed().collect(Collectors.toMap(i -> I.get(i), i -> i)));
    }

    private TreeNode helperConstruct(int[] preorder, int pStart, int pEnd, int iStart, int iEnd, Map <Integer, Integer> nodeToInorderIdx) {
        if(pEnd <= pStart || iEnd <= iStart) {
            return null;
        }

        int rootInorderIdx = nodeToInorderIdx.get(preorder[pStart]);
        int leftSubtreeSize = rootInorderIdx - iStart;

        TreeNode root = new TreeNode(preorder[pStart]);
        root.left = helperConstruct(preorder, pStart + 1, pStart + 1 + leftSubtreeSize, iStart, rootInorderIdx, nodeToInorderIdx);
        root.right = helperConstruct(preorder, pStart + 1 + leftSubtreeSize, pend, rootInorderIdx + 1, iEnd, noteToInorderIdx);
        return root;
    }
}
