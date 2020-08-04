import java.util.List;
import java.util.Arrays;

public class ConstructBianryTreePostOrder {
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
}
