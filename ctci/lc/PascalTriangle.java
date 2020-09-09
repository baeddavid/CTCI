import java.util.List;
import java.util.ArrayList;

public class PascalTriangle {
    // Given an integer construct a pascal triangle with the number of rows
    public static List<List<Integer>> pascalTriangle(int n) {
        List<List<Intege>> triangle = new ArrayList<>();
        if(n == 0) { return triangle; }

        triangle.get(0).add(1);
        for(int i = 1; i < n; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
