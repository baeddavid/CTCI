import java.util.Lists;
import java.util.ArrayLists;
import java.util.Collections;

public class dutchPartition {
    // Brute Force Solution
    public static void dutchPartition(List <Integer> A, int k) {
	int pivot = A.get(k);
	for(int i = 0; i < A.size(); i++) {
	    for(int j = i + 1; j < A.size(); j++) {
		if(A.get(j) < pivot) {
		    Collections.swap(A, i, j);
		    break;
		}
	    }
	}

	for(int i = A.size() - 1; i >= 0; i--) {
	    for(int j = i - 1; j >= 0; j--) {
		if(A.get(j) < pivot) {
		    Collections.swap(A, i, j);
		    break;
		}
	    }
	}
    }
    // Optimal Solution
    public static void dutchPartitionOptimal(List <Integer> A, int k) {
	int pivot = A.get(k);
	int smaller = 0, equal = 0, larger = A.size() - 1;
	while(equal < larger) {
	    if(A.get(equal) < pivot) {
		Collections.swap(A, equal++, smaller++);
	    } else if(A.get(equal) == pivot) {
		equal++;
	    } else {
		Collections.swap(A, larger--, equal);
	    }
	}
}
    
