import java.util.List;
import java.util.Arrays;

public class ConstructBinaryTreePostOrder {
    int end;

    public TreeNode postOrderConstruct(int[] P, int[] I) {
        if(P == null || I == null || P.length == 0 || I.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(P[P.length - 1]);
        int rootIdx = -1;

        for(int i = 0; i < I.length; i++) {
            if(I[i] == P[P.length - 1]) {
                rootIdx = i;
                break;
            }
        }

        int[] leftPostOrderRoot = Arrays.copyOfRange(P, 0, rootIdx);
        int[] rightPostOrderRoot = Arrays.copyOfRange(P, rootIdx, P.length - 1);
        int[] leftInOrderRoot = Arrays.copyOfRange(I, 0, rootIdx);
        int[] rightInOrderRoot = Arrays.copyOfRange(I, rootIdx + 1, I.length);

        root.left = postOrderConstruct(leftPostOrderRoot, leftInOrderRoot);
        root.right = postOrderConstruct(rightPostOrderRoot, rightInOrderRoot);

        return root;
    }

    // Optimal Solution using a hashmap to cache the value so that we don't perform a linear scan through the I traversal data for every recursive call
    public TreeNode constructTree(int[] preorder, int[] inorder) {
       List <Integer> I = IntStream.of(inorder).boxed().collect(Collectors.toList());
       index = preorder.length - 1;
       return helperConstruct(preorder, 0, preorder.length - 1, 0, inorder.length - 1,
                              IntStream.rangeOf(0, inorder.length).boxed().collect(Collectors.toMap(i -> I.get(i), i -> i)));
    }

    private TreeNode helperConstruct(int[] P, int startP, int endP, int startI, int endI, Map <Integer, Integer> rootInorderIdx) {
       if(endP <= startP || endI <= startI) {
           return null;
       }

       TreeNode root = new TreeNode(P[end--]);
       int rootIdx = rootInorderIdx.get(root.val);
       int leftSubtreeSize = rootIdx - startI;

       root.right = helperConstruct(P, startP + 1 + leftSubtreeSize, endP, rootIdx + 1, endI, rootInorderIdx);
       root.left = helperConstruct(P, startP, rootIdx, startI, rootIdx, rootInorderIdx);

       return root;
    }
}
