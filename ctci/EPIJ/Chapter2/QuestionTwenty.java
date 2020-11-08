import java.util.List;
import java.util.ArrayList;

public class QuestionTwenty {
    public static List<List<Integer>> pascal(int n) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(n == 0) { return triangle; }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for(int i = 1; i < n; i++) {
            List<Integer> current = triangle.get(i - 1);
            List<Integer> newList = new ArrayList<>();
            newList.add(1);
            for(int j = 1; j < current.size(); j++) {
                newList.add(current.get(j) + current.get(j - 1));
            }
            newList.add(1);
            triangle.add(newList);
        }
        return triangle;
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = pascal(5);
        for(int i = 0; i < triangle.size(); i++) {
            for(int j = 0; j < triangle.get(i).size(); j++) {
                System.out.println(triangle.get(i).get(j));
            }
        }
    }
}
