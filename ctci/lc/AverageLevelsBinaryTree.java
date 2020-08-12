import java.util.Queue;
import java.util.List;
import java.util.ArrayList;

public class AverageLevelsBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new Queue<>();
        List<Double> levelMean = new ArrayList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            Double currentLevelSum = 0;
            Double nodeCount = 0;
            while(!queue.isEmpty()) {
                Queue<TreeNode> temp = new Queue<>();
                TreeNode node = queue.poll();
                nodeCount++;
                currentLevelSum += node.val;

                if(node.left != null) {
                    temp.add(node.left);
                }

                if(node.right != null) {
                    temp.add(node.right);
                }
            }
            queue = temp;
            levelMean.add(currentLevelSum / nodeCount);
        }
        return levelMean;
    }
}
