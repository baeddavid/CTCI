import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class AverageLevelsBinaryTree {
    public List<Float> getAverageLevels(TreeNode root) {
        List<Float> average = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            Queue<TreeNode> temp = new LinkedList<>();
            Long currentLevelSum = 0;
            Long nodeCount = 0;
            while(!queue.isEmpty()) {
                TreeNode curr = queue.poll();
                nodeCount++;
                currentLevelSum += curr.val;

                if(current.left != null) {
                    temp.add(current.left);
                }

                if(current.right != null) {
                    temp.add(current.right);
                }
            }
            queue = temp;
            average.add(1.0 * currentLevelSum / nodeCount);
        }
        return average;
    }
}
