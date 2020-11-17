import java.util.ArrayList;

public class QuestionPowerSet {
    public static ArrayList<ArrayList<Integer>> powerSet(ArrayList<Integer> A, int index) {
        ArrayList<ArrayList<Integer>> powerset;
        if(A.size() == index) {
            powerset = new ArrayList<>();
            powerset.add(new ArrayList<>());
        } else {
            powerset = powerSet(A, index + 1);
            ArrayList<ArrayList<Integer>> currentPowerSet = new ArrayList<>();
            int currentElement = A.get(index);
            for(ArrayList<Integer> subset : powerset) {
                ArrayList<Integer> newSubset = new ArrayList<>();
                newSubset.addAll(subset);
                newSubset.add(currentElement);
                // To avoid concurrent modification exception
                currentPowerSet.add(newSubset);
            }
            powerset.addAll(currentPowerSet);
        }
        return powerset;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        ArrayList<ArrayList<Integer>> ps = powerSet(list, 0);
        for(ArrayList<Integer> subset : ps) {
            for(int i = 0; i < subset.size(); i++) {
                System.out.print(subset.get(i) + " ");
            }
            System.out.println("");
        }
    }
}
